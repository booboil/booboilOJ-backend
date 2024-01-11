package com.booboil.oj.judge.strategy;

import com.booboil.oj.judge.codesandbox.model.JudgeInfo;
import com.booboil.oj.model.dto.question.JudgeCase;
import com.booboil.oj.model.entity.Question;
import com.booboil.oj.model.entity.QuestionSubmit;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {
    @ApiModelProperty("判题信息")
    private JudgeInfo judgeInfo;

    @ApiModelProperty("输入用例列表")
    private List<String> inputList;

    @ApiModelProperty("输出用例列表")
    private List<String> outputList;

    @ApiModelProperty("题目用例列表")
    private List<JudgeCase> judgeCaseList;

    @ApiModelProperty("题目")
    private Question question;

    @ApiModelProperty("题目提交")
    private QuestionSubmit questionSubmit;
}
