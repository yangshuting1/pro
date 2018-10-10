package com.sugar.demo.common;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ErrorCode {

    //状态码
    public final static int SUCCESS = 10000;
    public final static int FAIL = 10001;

    // ImmutableMap：保存一些常量映射的键值对
    public final static Map<Integer, String> errorMessage = new ImmutableMap.Builder<Integer, String>()
            .put(SUCCESS, "成功")
            .put(FAIL, "失败")
            .build();
}
