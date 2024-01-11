package com.booboil.oj.judge.codesandbox.Impl;

import com.booboil.oj.judge.codesandbox.CodeSandbox;
import com.booboil.oj.judge.codesandbox.model.ExecuteCodeResponse;
import com.booboil.oj.judge.codesandbox.model.ExecuteCodeRequest;
import com.booboil.oj.judge.codesandbox.model.JudgeInfo;
import com.booboil.oj.model.enums.JudgeInfoMessageEnum;
import com.booboil.oj.model.enums.QuestionSubmitStatusEnum;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 示例代码沙箱（仅为了铺跑同业务流程）
 */
@Slf4j
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEND.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
