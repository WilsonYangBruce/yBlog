package com.masterdream.blogManage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.masterdream.blogManage.dao.TodoListDao;
import com.masterdream.blogManage.model.dto.TodoListDto;
import com.masterdream.blogManage.model.entity.TodoListDO;
import com.masterdream.blogManage.service.intf.ITodoListService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @Date: 2019/12/7
 * @Author: yangjie
 * desc:
 **/
@Slf4j
@Service
public class TodoListServiceImpl extends ServiceImpl<TodoListDao, TodoListDO> implements ITodoListService {

    @Override
    public TodoListDO create(String content) {
        TodoListDO todoListDO = new TodoListDO();
        todoListDO.createTodoList(content);
        return save(todoListDO) ? todoListDO : null;
    }

    @Override
    public TodoListDO delete(String id) {
        TodoListDO todoListDO = getById(id);
        if (todoListDO != null) {
            return super.removeById(id) ? todoListDO : null;
        } else {
            throw new RuntimeException("查询为null，id错误");
        }
    }

    @Override
    public TodoListDO update(TodoListDto todoList) {
        TodoListDO todoListDO = getById(todoList.getId());
        if (todoListDO != null) {
            Integer status = todoList.getStatus();
            if (status != null) {
                switch (status) {
                    case 1:
                        todoListDO.start();
                        break;
                    case 2:
                        todoListDO.finish();
                        break;
                    case 3:
                        todoListDO.undone();
                        break;
                }
            }
            String content = todoList.getContent();
            if (!StringUtils.isEmpty(content)) {
                todoListDO.setContent(content);
            }
            return super.updateById(todoListDO) ? todoListDO : null;
        } else {
            throw new RuntimeException("查询为null，id错误");
        }
    }
}
