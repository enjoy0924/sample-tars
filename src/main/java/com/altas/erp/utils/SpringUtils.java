package com.altas.erp.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by G_dragon on 2017/5/17.
 */
public class SpringUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * @return ApplicationContext
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * 获取对象
     * 这里重写了bean方法，起主要作用
     * @param name
     * @return Object 一个以所给名字注册的bean的实例
     * @throws BeansException
     */
    public static Object getBean(String name) throws BeansException {
        return applicationContext.getBean(name);
    }

    public static <T> T getBean(Class<T> t) {
        return applicationContext.getBean(t);
    }
}
