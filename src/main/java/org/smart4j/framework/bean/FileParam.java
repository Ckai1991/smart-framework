package org.smart4j.framework.bean;

import java.io.InputStream;

/**
 * 封装上传文件参数
 * Created by admin on 2015/10/19.
 */
public class FileParam {
    public String getFieldName() {
        return fieldName;
    }

    public String getFileName() {
        return fileName;
    }

    public long getFilesize() {
        return filesize;
    }

    public String getContentType() {
        return contentType;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    private String fieldName;
    private String fileName;
    private long filesize;
    private String contentType;
    private InputStream inputStream;

    public FileParam(String fieldName,String fileName,long filesize,String contentType,InputStream inputStream){
        this.fieldName = fieldName;
        this.fileName = fileName;
        this.filesize = filesize;
        this.inputStream = inputStream;
        this.contentType = contentType;
    }


}
