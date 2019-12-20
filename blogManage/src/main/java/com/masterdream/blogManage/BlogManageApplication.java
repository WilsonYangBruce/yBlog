package com.masterdream.blogManage;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Date: 2019/12/19
 * @Author: yangjie
 * desc:
 **/
@EnableEncryptableProperties
@SpringBootApplication
public class BlogManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogManageApplication.class, args);
    }
}
