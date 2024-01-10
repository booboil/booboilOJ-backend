package com.booboil.oj.judge.codesandbox.Impl;

import com.booboil.oj.judge.codesandbox.CodeSandbox;
import com.booboil.oj.judge.codesandbox.model.ExecuteCodeResponse;
import com.booboil.oj.judge.codesandbox.model.ExecuteCodeRequest;
import lombok.extern.slf4j.Slf4j;

/**
 * 示例代码沙箱（仅为了铺跑同业务流程）
 */
@Slf4j
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("示例代码沙箱");
        return null;
    }
}
