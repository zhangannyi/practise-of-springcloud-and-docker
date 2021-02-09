package fun.liwudi.feignhytrix.feign;

import fun.liwudi.feignhytrix.feign.rollback.HiRollback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 李武第
 */
@FeignClient(value = "eureka-client" ,fallback = HiRollback.class)
public interface HiFeign {
    @RequestMapping("/hi")
    String helloWorldEurekaClient(@RequestParam("name") String name );
}
