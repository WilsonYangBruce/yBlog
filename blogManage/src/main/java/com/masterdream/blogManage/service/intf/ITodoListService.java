package com.masterdream.blogManage.service.intf;

import com.baomidou.mybatisplus.extension.service.IService;
import com.masterdream.blogManage.model.dto.TodoListDto;
import com.masterdream.blogManage.model.entity.TodoListDO;

/**
 * @Date: 2019/12/7
 * @Author: yangjie
 * desc:
 **/
public interface ITodoListService extends IService<TodoListDO> {

    TodoListDO create(String content);

    TodoListDO delete(String id);

    TodoListDO update(TodoListDto todoList);
}
