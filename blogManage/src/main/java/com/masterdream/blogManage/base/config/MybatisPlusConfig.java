package com.masterdream.blogManage.base.config;

import com.baomidou.mybatisplus.extension.incrementer.H2KeyGenerator;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.extension.plugins.SqlExplainInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.masterdream.blogManage.dao")
public class MybatisPlusConfig {

    @Bean // 性能分析拦截器
    public static PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }

    @Bean // 执行分析拦截器
    public static SqlExplainInterceptor sqlExplainInterceptor() {
        return new SqlExplainInterceptor();
    }

    @Bean // 启用分页插件
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    @Bean
    public static H2KeyGenerator getH2KeyGenerator() {
        return new H2KeyGenerator();
    }

}
