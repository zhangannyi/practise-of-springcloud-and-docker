package fun.liwudi.hystrixservice.rest;

import fun.liwudi.hystrixservice.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李武第
 */
@RestController
public class HystrixRest {
    @Autowired
    HelloService helloService;

    @RequestMapping("/hiHystrix")
    public String hiHystrtix(@RequestParam("name") String name){
        return helloService.helloService(name);
    }
}
