package fun.liwudi.feignservice.rest;

import fun.liwudi.feignservice.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李武第
 */
@RestController
public class FeignRest {

    @Autowired
    FeignService feignService;

    @RequestMapping("/feignHi")
    public String hi(@RequestParam("name") String name){
        return feignService.feignHi(name);
    }
}
