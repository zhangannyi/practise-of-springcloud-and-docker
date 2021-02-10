package fun.liwudi.graduatedesignverifyservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 李武第
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("fun.liwudi.graduatedesignverifyservice.mapper")
@EnableZuulProxy
public class GraduateDesignVerifyServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraduateDesignVerifyServiceApplication.class, args);
    }

}
