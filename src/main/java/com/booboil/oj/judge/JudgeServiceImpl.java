package com.booboil.oj.judge;

import com.booboil.oj.common.ErrorCode;
import com.booboil.oj.exception.BusinessException;
import com.booboil.oj.judge.codesandbox.CodeSandbox;
import com.booboil.oj.judge.codesandbox.CodeSandboxFactory;
import com.booboil.oj.judge.codesandbox.CodeSandboxProxy;
import com.booboil.oj.judge.codesandbox.model.ExecuteCodeResponse;
import com.booboil.oj.model.entity.Question;
import com.booboil.oj.model.entity.QuestionSubmit;
import com.booboil.oj.model.enums.QuestionSubmitStatusEnum;
import com.booboil.oj.service.QuestionService;
import com.booboil.oj.service.QuestionSubmitService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class JudgeServiceImpl implements JudegeService{

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionSubmitService questionSubmitService;


    @Value("${codesandbox.type:example}")
    private String type;


    // 5.根据代码沙箱的执行结果，设置题目的判题状态和信息

    @Override
    public ExecuteCodeResponse doJudge(long questionSubmitId) {
        // 1.传入题目的提交id，获取到对应的题目、提交信息（包含代码、编程语言等）
        QuestionSubmit questionSubmit = questionSubmitService.getById(questionSubmitId);
        if (questionSubmit != null) {
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR,"提交信息不存在");
        }
        Long questionId = questionSubmit.getQuestionId();
        Question question = questionService.getById(questionId);
        if (question == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR,"题目不存在");
        }
        // 2.如果题目提交状态不为等待中，就不用重复执行
        if (!questionSubmit.getStatus().equals(QuestionSubmitStatusEnum.WAITING.getValue())) {
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR,"题目正在判题中");
        }
        // 3.更改判题（题目提交）的状态为"判题中"，防止重复执行
        QuestionSubmit questionSubmitUpdate = new QuestionSubmit();
        questionSubmitUpdate.setId(questionSubmitId);
        questionSubmitUpdate.setStatus(QuestionSubmitStatusEnum.RUNNING.getValue());
        boolean update = questionSubmitService.updateById(questionSubmitUpdate);
        if (!update) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR,"题目状态更新错误");
        }
        // 4.调用代码沙箱，获取到执行结果
        CodeSandbox codeSandbox = CodeSandboxFactory.newInstance(type);
        codeSandbox = new CodeSandboxProxy(codeSandbox);
        Long id = questionSubmit.getId();
        String language = questionSubmit.getLanguage();
        String code = questionSubmit.getCode();
        String judgeInfo = questionSubmit.getJudgeInfo();
        Integer status = questionSubmit.getStatus();

        Long userId = questionSubmit.getUserId();
        Date createTime = questionSubmit.getCreateTime();
        Date updateTime = questionSubmit.getUpdateTime();
        Integer isDelete = questionSubmit.getIsDelete();

        return null;
    }
}
