package com.booboil.oj.judge.codesandbox.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExecuteCodeRequest {

    /**
     * 题目输入用例
     */
    private List<String> inputList;

    /**
     *  题目代码
     */
    private String code;

    /**
     *  编程语言
     */
    private String language;

}
