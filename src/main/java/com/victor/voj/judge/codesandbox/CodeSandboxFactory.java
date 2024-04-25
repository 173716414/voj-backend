package com.victor.voj.judge.codesandbox;

/*
 *Author：Victor_htq
 *Package：com.victor.voj.judge.codesandbox
 *Project：voj-backend
 *name：CodeSandboxFactory
 *Date：2024/4/25  16:55
 *Filename：CodeSandboxFactory
 */

import com.victor.voj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.victor.voj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.victor.voj.judge.codesandbox.impl.ThirdPartyCodeSandbox;

/**
 * 根据字符串选择代码沙箱实现类
 * 静态工程
 */
public class CodeSandboxFactory {

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
