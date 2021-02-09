package fun.liwudi.graduatedesignuserinfomanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
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
@EnableZuulProxy
@MapperScan("fun.liwudi.graduatedesignuserinfomanage.mapper")
@EnableFeignClients
@EnableDiscoveryClient
@EnableEurekaClient
public class GraduateDesignUserInfoManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraduateDesignUserInfoManageApplication.class, args);
    }

}
