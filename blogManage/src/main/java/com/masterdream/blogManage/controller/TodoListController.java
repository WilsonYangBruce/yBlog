package com.masterdream.blogManage.controller;

import com.masterdream.blogManage.base.BaseController;
import com.masterdream.blogManage.base.result.ResultEntity;
import com.masterdream.blogManage.base.result.ResultTool;
import com.masterdream.blogManage.model.dto.TodoListDto;
import com.masterdream.blogManage.model.entity.TodoListDO;
import com.masterdream.blogManage.service.intf.ITodoListService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation(value = "查询", notes = "查询")
    @GetMapping
    public ResultEntity list() {
        return ResultTool.ok(todoListService.list());
    }

    @ApiOperation(value = "查询", notes = "查询")
    @GetMapping(value = "/{id}")
    public ResultEntity list(@PathVariable(value = "id", required = false) String id) {
        if (StringUtils.isEmpty(id)) {
            return ResultTool.fail("id为null");
        } else {
            TodoListDO todoListDO = todoListService.getById(id);
            return todoListDO != null ? ResultTool.ok(todoListDO) : ResultTool.fail(ResultTool.HttpResponseCode.NOT_FOUND);
        }
    }

    @ApiOperation(value = "新增", notes = "新增")
    @PostMapping
    public ResultEntity create(@RequestParam String content) {
        return ResultTool.ok(todoListService.create(content));
    }

    @ApiOperation(value = "删除", notes = "删除")
    @DeleteMapping(value = "/{id}")
    public ResultEntity delete(@PathVariable(value = "id") String id) {
        return ResultTool.ok(todoListService.delete(id));
    }

    @ApiOperation(value = "更新", notes = "更新")
    @PutMapping
    public ResultEntity update(TodoListDto todoList) {
        return ResultTool.ok(todoListService.update(todoList));
    }
}
