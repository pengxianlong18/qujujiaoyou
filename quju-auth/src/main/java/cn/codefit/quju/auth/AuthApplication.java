package cn.codefit.quju.auth;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Some description here.
 *
 * @author CodeFit.cn
 * @version 1.0, 2024/07/12
 */
@DubboComponentScan(value = "cn.codefit.quju.auth.service")
@EnableDiscoveryClient
@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
//@ComponentScan("cn.codefit.quju.auth.security.config.security")
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }
}
