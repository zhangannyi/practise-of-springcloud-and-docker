package fun.liwudi.graduatedesignverifyservice.feign;

import fun.liwudi.graduatedesignverifyservice.domain.CheckInfo;
import fun.liwudi.graduatedesignverifyservice.domain.JsonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author 李武第
 */
@FeignClient("yier-design-graduate")
public interface CheckInfoFeign {
    @PostMapping("/ckeck")
    JsonResponse check(@RequestBody CheckInfo checkInfo);
}
