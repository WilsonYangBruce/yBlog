package com.masterdream.blogManage.model;

import com.baomidou.mybatisplus.annotation.TableName;
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
    // 0- 开始，1 -完成，2- 未完成
    private Integer status;
    //
    private LocalDateTime startDate;
    private LocalDateTime closeDate;
    //
    private LocalDateTime createDate;

    //新建todo
    public void createTodoList(String content) {
        this.content = content;
        this.createDate = LocalDateTime.now();
    }

    //开始todo
    public void start() {
        this.status = 0;
        this.startDate = LocalDateTime.now();
    }

    //完成
    public void finish() {
        this.status = 1;
        this.closeDate = LocalDateTime.now();
    }

    //未完成
    public void undone() {
        this.status = 2;
    }

}
