package org.smart4j.framework.bean;

/**
 * 封装表单参数
 * Created by admin on 2015/10/19.
 */
public class FormParam {
    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

    private String fieldName;
    private Object fieldValue;

    public FormParam(String fieldName,Object fieldValue){
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
}
