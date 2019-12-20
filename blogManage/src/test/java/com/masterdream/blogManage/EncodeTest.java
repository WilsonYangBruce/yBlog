package com.masterdream.blogManage;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Date: 2019/12/4
 * @Author: yangjie
 * desc:
 **/
@SpringBootTest
public class EncodeTest {

    @Autowired
    StringEncryptor stringEncryptor;

    @Test
    public void encryptPwd() {
        //加密密码
        String pwd = stringEncryptor.encrypt("12345");
        System.out.println(pwd);
        //880quql4iD6cJD2XAWwAMysi9Q0dglt/7nFi6rWcOjpgRk/ozqwFGYhuaYu4/OAA
        String decrypt = stringEncryptor.decrypt("880quql4iD6cJD2XAWwAMysi9Q0dglt/7nFi6rWcOjpgRk/ozqwFGYhuaYu4/OAA");
        //解密后的密码：12345
        System.out.println(decrypt);
    }
    @Test
    public void test() {
        //加密密码
        String pwd = stringEncryptor.encrypt("123456");
        System.out.println(pwd);
        //880quql4iD6cJD2XAWwAMysi9Q0dglt/7nFi6rWcOjpgRk/ozqwFGYhuaYu4/OAA
        String decrypt = stringEncryptor.decrypt("/SHFlGlmq3PwlDJmrclPEhWBoHh2BC+4N6tEBrcqiOPsAA0t1eL8dIbHJhWNfLyT");
        //解密后的密码：12345
        System.out.println(decrypt);
    }
}