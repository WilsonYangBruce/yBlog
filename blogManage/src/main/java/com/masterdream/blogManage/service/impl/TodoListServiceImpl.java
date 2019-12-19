package com.masterdream.blogManage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.masterdream.blogManage.dao.TodoListDao;
import com.masterdream.blogManage.model.TodoListDO;
import com.masterdream.blogManage.service.intf.ITodoListService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Date: 2019/12/7
 * @Author: yangjie
 * desc:
 **/
@Slf4j
@Service
public class TodoListServiceImpl extends ServiceImpl<TodoListDao, TodoListDO> implements ITodoListService {

}
