package com.booboil.oj.model.dto.question;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 题目用例
 */
@Data
public class JudgeCase {

    @ApiModelProperty("输入用例")
    private String input;

    @ApiModelProperty("输出用例")
    private String output;
}
