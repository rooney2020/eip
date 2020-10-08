/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ioc.container;

/**
 * @author KSC
 * @description
 */
public class ConstructorArg {
    private Class cls;
    private Object value;
    private String ref;
    private Class refCls;

    public ConstructorArg(Class cls, String ref, Class refCls) {
        this.cls = cls;
        this.ref = ref;
        this.refCls = refCls;
    }

    public ConstructorArg(Class cls, Object value) {
        this.cls = cls;
        this.value = value;
    }

    public Class getCls() {
        return cls;
    }

    public void setCls(Class cls) {
        this.cls = cls;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Class getRefCls() {
        return refCls;
    }

    public void setRefCls(Class refCls) {
        this.refCls = refCls;
    }
}
