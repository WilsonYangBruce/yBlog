package com.masterdream.blogmanage;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : yangjie
 * desc:
 * @date : 2019/12/19
 **/
@EnableEncryptableProperties
@SpringBootApplication
public class BlogManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogManageApplication.class, args);
    }
}
