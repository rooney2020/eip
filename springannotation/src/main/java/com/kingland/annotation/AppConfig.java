/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.annotation;

import com.kingland.annotation.bean.Benz;
import com.kingland.annotation.bean.Bmw;
import com.kingland.annotation.bean.Intern;
import com.kingland.annotation.bean.Regular;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author KSC
 */
@Configuration
public class AppConfig {
    @Bean(name = "benz")
    @Scope("prototype")
    @Qualifier("cheap")
    public Benz getBenz() {
        return new Benz();
    }

    @Bean(name = "bmw")
    @Qualifier("expensive")
    public Bmw getBmw() {
        return new Bmw();
    }

    @Bean(name = "string1")
    public String getString() {
        return "string";
    }

    @Bean(name = "string2")
    public String getString2() {
        return "string2";
    }

    @Bean(name = "regular")
    public Regular getRegular() {
        return new Regular(getBenz());
    }

    @Bean(name = "intern")
    public Intern getIntern() {
        return new Intern();
    }
}
