package com.masterdream.blogmanage.base.config;

import com.baomidou.mybatisplus.extension.incrementer.H2KeyGenerator;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.extension.plugins.SqlExplainInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangjie
 */
@Configuration
@MapperScan(basePackages = "com.masterdream.blogManage.dao")
public class MybatisPlusConfig {
    /**
     * 性能分析拦截器
     */
    @Bean
    public static PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }

    /**
     * 执行分析拦截器
     */
    @Bean
    public static SqlExplainInterceptor sqlExplainInterceptor() {
        return new SqlExplainInterceptor();
    }

    /**
     * 启用分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    @Bean
    public static H2KeyGenerator getH2KeyGenerator() {
        return new H2KeyGenerator();
    }

}
