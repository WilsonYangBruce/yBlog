package com.masterdream.blogmanage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.masterdream.blogmanage.dao.TodoListDao;
import com.masterdream.blogmanage.model.dto.TodoListDto;
import com.masterdream.blogmanage.model.entity.TodoListDO;
import com.masterdream.blogmanage.service.intf.ITodoListService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author : yangjie
 * desc:
 * @date : 2019/12/7
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
                    default:
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
