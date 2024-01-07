package com.booboil.oj.model.dto.questionsubmit;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 题目判题信息
 */
@Data
public class JudgeInfo {

    @ApiModelProperty("程序执行信息")
    private String message;

    @ApiModelProperty("消耗时间 - ms")
    private String time;

    @ApiModelProperty("消耗内存 - kb")
    private String memory;

}
