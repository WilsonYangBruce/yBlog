package com.masterdream.blogManage.base.result;

import lombok.Data;

import java.io.Serializable;

//统一的返回体
@Data
public class ResultEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private int status;
    private String msg;
    private Object data;

    private static class Holder {
        private static ResultEntity resultEntity = new ResultEntity();
    }

    static ResultEntity getInstance() {
        return Holder.resultEntity;
    }

}
