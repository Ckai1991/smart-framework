package org.smart4j.framework.bean;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * 封装请求信息
 *
 * Created by admin on 2015/9/29.
 */
public class Request {
    /**
     * 请求方法
     */
    private String requestMethod;

    /**
     * 请求路径
     */
    private String requestPath;

    public Request(String requestMethod, String requestPath){
        this.requestMethod = requestMethod;
        this.requestPath = requestPath;
    }

    public String getRequestMethod(){
        return requestMethod;
    }

    public String getRequestPath(){
        return requestPath;
    }

    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this);
    }

    public boolean equals(Object obj){
        return EqualsBuilder.reflectionEquals(this,obj);
    }
}
