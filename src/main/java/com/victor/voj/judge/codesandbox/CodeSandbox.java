package com.victor.voj.judge.codesandbox;

import com.victor.voj.judge.codesandbox.model.ExecuteCodeRequest;
import com.victor.voj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
