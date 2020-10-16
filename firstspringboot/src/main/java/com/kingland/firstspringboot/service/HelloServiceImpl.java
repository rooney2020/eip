/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.firstspringboot.service;

import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author KSC
 */
@Service
public class HelloServiceImpl implements HelloService {
    private final String CN = "cn";

    /**
     * return greeting
     *
     * @param name name to print
     * @param lang language to print
     * @return a greeting string
     */
    @Override
    public String hello(String name, String lang) {
        String greeting = null;
        if (null == lang) {
            greeting = ResourceBundle.getBundle("i18n/hello").getString("greeting");
        } else if (CN.equals(lang)) {
            greeting = ResourceBundle.getBundle("i18n/hello", Locale.CHINA).getString("greeting");
        } else {
            greeting = ResourceBundle.getBundle("i18n/hello", Locale.US).getString("greeting");
        }
        greeting = changeCharset(greeting, "ISO-8859-1", "UTF-8");
        return greeting + name;
    }

    /**
     * change the charset of string
     *
     * @param str original string
     * @param original original charset of string
     * @param aim aimed charset
     * @return result
     */
    private static String changeCharset(String str, String original, String aim) {
        try {
            return new String(str.getBytes(original), aim);
        } catch (UnsupportedEncodingException e) {
            throw new Error(e);
        }
    }
}
