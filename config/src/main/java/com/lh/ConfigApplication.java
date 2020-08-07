package lh;


import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Copyright (C), 2006-2010, ChengDu longsan info. Co., Ltd.
 * FileName: Application.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/08/07 14:23
 */
@SpringBootApplication
// 加载dataId为 example的配置源，并开启自动更新
@NacosPropertySource(dataId = "example", autoRefreshed = true, groupId = "DEFAULT_GROUP")
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}