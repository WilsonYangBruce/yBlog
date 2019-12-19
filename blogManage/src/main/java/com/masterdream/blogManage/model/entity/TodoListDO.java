package com.masterdream.blogManage.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Date: 2019/12/19
 * @Author: yangjie
 * desc: 待办事项清单
 **/
@Data
@TableName(value = "todoList")
public class TodoListDO {

    private String id;
    //待办事项清单内容
    private String content;
    // 0- 未开始，1 -开始，2- 完成，3-未完成
    private Integer status = 0;
    //
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime startDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime closeDate;
    //
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createDate;

    //新建todo
    public void createTodoList(String content) {
        this.status = 0;
        this.content = content;
        this.createDate = LocalDateTime.now();
    }

    //开始todo
    public void start() {
        this.status = 1;
        this.startDate = LocalDateTime.now();
    }

    //完成
    public void finish() {
        this.status = 2;
        this.closeDate = LocalDateTime.now();
    }

    //未完成
    public void undone() {
        this.status = 3;
        this.closeDate = null;
    }

}
