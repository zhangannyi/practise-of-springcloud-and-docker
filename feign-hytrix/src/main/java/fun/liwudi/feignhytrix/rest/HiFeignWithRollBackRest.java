package fun.liwudi.feignhytrix.rest;

import fun.liwudi.feignhytrix.service.HiFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李武第
 */
@RestController
public class HiFeignWithRollBackRest {
    @Autowired
    HiFeignService hiFeignService;

    @RequestMapping("/hi")
    public String hiFeignWithRollBack(@RequestParam("name") String name){
        return hiFeignService.hiFeignWithRollBack(name);
    }
}
