/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ioc.container;

import com.kingland.ioc.util.BusinessException;
import com.kingland.ioc.util.Common;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * @author KSC
 */
public class IocContainerImpl implements IocContainer {

    Map<String, Object> map = new HashMap();

    /**
     * set the bean into container
     *
     * @param cls the type of bean class which you want to set into container
     * @param id   the id of bean in container
     * @param args the arguments of constructor
     */
    public void setBean(Class cls, String id, ConstructorArg[] args) {
        if (map.containsKey(id)) {
            throw new BusinessException(Common.NAME_REPEAT);
        }
        try {
            Class[] classes = new Class[args.length];
            Object[] parameters = new Object[args.length];

            for (int i = 0; i < args.length; i++) {
                classes[i] = args[i].getCls();
                if (null != args[i].getCls() && null != args[i].getValue()) {
                    parameters[i] = args[i].getValue();
                } else if (null != args[i].getCls() && null != args[i].getRef()) {
                    parameters[i] = getBean(args[i].getRef());
                } else {
                    throw new BusinessException(Common.NO_ARGS);
                }
            }
            Constructor constructor = cls.getDeclaredConstructor(classes);
            map.put(id, constructor.newInstance(parameters));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * get the bean from container
     *
     * @param id the id of bean
     * @return bean
     */
    public Object getBean(String id) {
        if (map.containsKey(id)) {
            return map.get(id);
        } else {
            throw new BusinessException(Common.NO_BEAN);
        }
    }
}
