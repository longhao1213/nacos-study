package com.lh.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2006-2010, ChengDu longsan info. Co., Ltd.
 * FileName: ConfigController.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/08/07 15:53
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    /**
     * 这里备注一下，如果配置文件为yaml格式的，在调用刷新配置文件接口的时候
     * http://127.0.0.1:8848/nacos/v1/cs/configs?dataId=cloudConfig.yaml&group=DEFAULT_GROUP&content=useLocalCache=true
     *
     * 在最后那里，因为yaml配置文件里面参数和冒号“：”中间有一个空格，所有这里也要加一个空格，要改成下面这样
     * http://127.0.0.1:8848/nacos/v1/cs/configs?dataId=cloudConfig.yaml&group=DEFAULT_GROUP&content=useLocalCache= true
     */

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @RequestMapping("/get")
    public boolean get() {
        return useLocalCache;
    }
}