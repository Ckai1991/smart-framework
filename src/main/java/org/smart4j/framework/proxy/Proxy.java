package org.smart4j.framework.proxy;

/**
 * 代理接口
 *
 * Created by admin on 2015/10/13.
 */
public interface Proxy {

    /**
     * 执行链式代理
     *
     * 链式代理：可将多个代理通过一条链子串起来，一个个地去执行，执行顺序取决于添加到链上的先后顺序
     *
     * @param proxyChain
     * @return
     * @throws Throwable
     */
    Object doProxy(ProxyChain proxyChain)throws Throwable;
}
