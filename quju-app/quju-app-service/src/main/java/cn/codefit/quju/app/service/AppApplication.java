package cn.codefit.quju.app.service;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Some description here.
 *
 * @author CodeFit.cn
 * @version 1.0, 2024/07/14
 */
@DubboComponentScan(value = "cn.codefit.quju.app.service")
@EnableDiscoveryClient
@MapperScan({"cn.codefit.quju.app.model.dao","cn.codefit.quju.app.service.biz.dao"})
@SpringBootApplication
public class AppApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }
}
