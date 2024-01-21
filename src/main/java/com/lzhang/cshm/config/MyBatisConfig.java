package com.lzhang.cshm.config;

import com.lzhang.cshm.Interceptor.common.TimeInterceptor;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author:lizhihang
 * @date: 2024/1/19 13:38
 * @description: 注册TimeInterceptor拦截器
 */

@Configuration

public class MyBatisConfig {

    @Bean
    public ConfigurationCustomizer mybatisConfigurationCustomizer() {
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                configuration.addInterceptor(new TimeInterceptor());
            }
        };
    }
}
