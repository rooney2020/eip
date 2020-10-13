/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.firstspringboot.service;

import java.io.UnsupportedEncodingException;

/**
 * @author KSC
 */
public interface HelloService {
    /**
     * return "hello, " and name
     *
     * @param name name to print
     * @param lang language to print
     * @return a print string
     */
    public String hello(String name, String lang);
}
