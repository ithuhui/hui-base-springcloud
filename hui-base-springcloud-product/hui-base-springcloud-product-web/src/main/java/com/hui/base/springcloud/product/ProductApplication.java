package com.hui.base.springcloud.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b><code>ProductApplication</code></b>
 * <p/>
 * Description:
 * <p/>
 * <b>Creation Time:</b> 2018/11/26 0:11.
 *
 * @author Hu Weihui
 */
@EnableEurekaClient
@MapperScan("com.hui.base.springcloud.*.mapper")
@SpringBootApplication(scanBasePackages = "com.hui.base.springcloud")
@EnableFeignClients(basePackages = "com.hui.base.springcloud")
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}