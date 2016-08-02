package com.wx.learning.core.factory;

import org.springframework.beans.factory.FactoryBean;

public class CustomFactoryBean implements FactoryBean {
    public Object getObject() throws Exception {
        return null;
    }

    public Class<?> getObjectType() {
        return null;
    }

    public boolean isSingleton() {
        return false;
    }
}
