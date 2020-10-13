/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.firstspringboot.common;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author KSC
 */
public class MyMvcConfig implements WebMvcConfigurer {
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocalResolver();
    }
}
