package com.masterdream.blogManage.controller;

import com.masterdream.blogManage.base.BaseController;
import com.masterdream.blogManage.base.result.ResultEntity;
import com.masterdream.blogManage.base.result.ResultTool;
import com.masterdream.blogManage.service.intf.ITodoListService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2019/12/19
 * @Author: yangjie
 * desc:  todolist
 **/
@Slf4j
@RestController
@RequestMapping(value = "/todoList")
public class TodoListController extends BaseController {
    @Autowired
    private ITodoListService todoListService;

    @GetMapping
    public ResultEntity list() {
        return ResultTool.ok(todoListService.list());
    }
}
