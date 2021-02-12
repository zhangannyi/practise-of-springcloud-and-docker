package fun.liwudi.graduatedesignverifyservice.feign;

import fun.liwudi.graduatedesignverifyservice.domain.JsonResponse;
import fun.liwudi.graduatedesignverifyservice.domain.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author 李武第
 */
@FeignClient("yier-design-graduate")
public interface UserConfFeign {
    @PostMapping("/selectUser")
    JsonResponse<UserInfo> select(@RequestBody UserInfo userInfo);
}
