/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ioc.container;

/**
 * @author KSC
 */
public class ConstructorArg {
    /**
     * primitive type class, low priority.
     * Or the interface class or abstract class of this reference, high priority.
     */
    private Class cls;

    /**
     * value
     */
    private Object value;

    /**
     * reference value
     */
    private String ref;

    /**
     *
     * @param cls reference type class
     * @param ref reference value
     */
    public ConstructorArg(Class cls, String ref) {
        this.cls = cls;
        this.ref = ref;
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
}
