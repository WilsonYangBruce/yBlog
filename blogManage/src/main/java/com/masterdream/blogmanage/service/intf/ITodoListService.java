package com.masterdream.blogmanage.service.intf;

import com.baomidou.mybatisplus.extension.service.IService;
import com.masterdream.blogmanage.model.dto.TodoListDto;
import com.masterdream.blogmanage.model.entity.TodoListDO;

/**
 * @author yangjie
 * desc:
 * @date 2019/12/7
 **/
public interface ITodoListService extends IService<TodoListDO> {
    /**
     * @param content 内容
     * @return 新建
     */
    TodoListDO create(String content);

    /**
     * @param id
     * @return
     */
    TodoListDO delete(String id);

    /**
     * @param todoList
     * @return
     */

    TodoListDO update(TodoListDto todoList);
}
