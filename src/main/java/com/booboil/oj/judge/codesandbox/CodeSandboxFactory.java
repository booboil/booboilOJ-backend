package com.booboil.oj.judge.codesandbox;

import com.booboil.oj.judge.codesandbox.Impl.ExampleCodeSandbox;
import com.booboil.oj.judge.codesandbox.Impl.RemoteCodeSandbox;
import com.booboil.oj.judge.codesandbox.Impl.ThirdPartyCodeSandbox;

/**
 * 代码沙箱工厂（根据字符串参数创建指定的代码沙箱示例）
 */
public class CodeSandboxFactory {

    /**
     * 创建代码沙箱示例
     * @param type
     * @return
     */
    public static CodeSandbox newInstance(String type) {
        switch (type) {
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }
}
