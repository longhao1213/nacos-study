package lh.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: ConfigController.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/08/07 14:29
 */
@Controller
@RequestMapping("/config")
public class ConfigController {

    @NacosValue(value = "${useLocalCache:false}",autoRefreshed = true)
    private boolean useLocalCache;

    @RequestMapping("/get")
    @ResponseBody
    public boolean get(){
        return useLocalCache;
    }
}