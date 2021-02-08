package fun.liwudi.feignservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 李武第
 */
@FeignClient("eureka-client")
public interface HiFeign {

    @RequestMapping("/hi")
    String helloWorldEurekaClient(String name);

}
