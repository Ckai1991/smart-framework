package org.smart4j.framework.bean;

import java.lang.reflect.Method;

/**
 * 封装Action信息
 *
 * Created by admin on 2015/9/29.
 */
public class Handler {
    /**
     * Controller类
     */
    private Class<?> controllerClass;

    /**
     * Action方法
     */
    private Method actionMethod;

    public Handler(Class<?> controllerClass, Method actionMethod){
        this.actionMethod = actionMethod;
        this.controllerClass = controllerClass;
    }

    public Class<?> getControllerClass(){
        return controllerClass;
    }

    public Method getActionMethod(){
        return actionMethod;
    }
}
