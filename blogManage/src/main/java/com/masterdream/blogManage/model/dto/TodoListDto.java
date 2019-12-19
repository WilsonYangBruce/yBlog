package com.masterdream.blogManage.model.dto;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @Date: 2019/12/19
 * @Author: yangjie
 * desc:
 **/
@Data
public class TodoListDto {
    @NotNull
    private String id;
    //待办事项清单内容
    private String content;
    //1 -开始，2- 完成，3-未完成
    @Min(1)
    @Max(3)
    private Integer status = 0;
}
