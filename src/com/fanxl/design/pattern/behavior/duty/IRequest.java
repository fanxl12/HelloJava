package com.fanxl.design.pattern.behavior.duty;

// 请求接口
public interface IRequest {
    // 获取请求级别
    int getRequestLevel();

    // 获取要请求的内容
    String getRequest();
}