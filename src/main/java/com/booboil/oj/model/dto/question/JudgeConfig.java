package com.booboil.oj.model.dto.question;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 题目配置
 */
@Data
public class JudgeConfig {

    @ApiModelProperty("时间限制 - ms")
    private Long timeLimit;

    @ApiModelProperty("内存限制 - kb")
    private Long memoryLimit;

    @ApiModelProperty("堆栈限制 - kb")
    private Long stackLimit;

}
