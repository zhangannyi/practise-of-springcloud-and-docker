package fun.liwudi.eurekaclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李武第
 */
@EnableEurekaClient
@SpringBootApplication
@RestController
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String helloWorldEurekaClient(@RequestParam(value = "name",defaultValue = "liwudi") String name ){
        return "HelloWorld "  + name +" i am port " + port;
    }

    /**
     * 实现前端页面访问http://localhost:8762/loveYiEr?name=lwd
     * 返回lwd love yier
     * int char double float boolean byte String
     * if while for
     *
     */
    @RequestMapping("/loveYiEr")
    public String anyi(@RequestParam (value ="name",defaultValue = "anyi") String zhanganyi){
        return zhanganyi+" love yier";
    }
    /**
     * todo zhanganyi write a method in this scope
     * input : name ,password
     * example : http://localhost:8762/login?name=anyi&password=lwd
     * return : success to log in
     * example : http://localhost:8762/login?name=anyi&password=gansulaodi
     * return : fail to log in
     */


}
