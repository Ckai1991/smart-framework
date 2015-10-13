package org.smart4j.framework.proxy;

import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 代理链
 *
 * Created by admin on 2015/10/13.
 */
public class ProxyChain {
    private final Class<?> targetClass;//目标类

    public Method getTargetMethod() {
        return targetMethod;
    }

    public Class<?> getTargetClass() {
        return targetClass;
    }

    public Object[] getMethodParams() {
        return methodParams;
    }

    private final Object targetObject;//目标对象
    private final Method targetMethod;//目标方法
    private final MethodProxy methodProxy;//方法代理
    private final Object[] methodParams;//方法参数
    private List<Proxy> proxyList = new ArrayList<Proxy>();//代理列表
    private int proxyIndex = 0;//代理索引

     public ProxyChain(Class<?> targetClass,Object targetObject , Method targetMethod, MethodProxy methodProxy,Object[] methodParams,List<Proxy> proxyList){
         this.targetClass = targetClass;
         this.methodParams = methodParams;
         this.methodProxy = methodProxy;
         this.proxyList = proxyList;
         this.targetMethod =targetMethod;
         this.targetObject = targetObject;
     }

    public Object doProxyChain() throws Throwable{
        Object methodResult;

        if(proxyIndex < proxyList.size()){
            methodResult = proxyList.get(proxyIndex++).doProxy(this);
        }else {
            methodResult = methodProxy.invokeSuper(targetObject,methodParams);
        }

        return methodResult;
    }

}
