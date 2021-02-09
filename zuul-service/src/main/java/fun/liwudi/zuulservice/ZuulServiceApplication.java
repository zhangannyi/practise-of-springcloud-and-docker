package fun.liwudi.zuulservice;

import com.netflix.zuul.ZuulFilter;
import fun.liwudi.zuulservice.filter.ErrorFilter;
import fun.liwudi.zuulservice.filter.PreFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @author 李武第
 */

@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@EnableZuulProxy
public class ZuulServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServiceApplication.class, args);
    }

    @Bean
    public ZuulFilter errorFilter(){
        return new ErrorFilter();
    }

    @Bean
    public ZuulFilter preFilter(){
        return new PreFilter();
    }
}
