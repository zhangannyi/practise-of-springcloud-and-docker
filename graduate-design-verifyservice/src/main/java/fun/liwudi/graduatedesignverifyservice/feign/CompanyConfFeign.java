package fun.liwudi.graduatedesignverifyservice.feign;

import fun.liwudi.graduatedesignverifyservice.domain.CompanyConf;
import fun.liwudi.graduatedesignverifyservice.domain.JsonResponse;
import fun.liwudi.graduatedesignverifyservice.domain.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author 李武第
 */
@FeignClient("yier-design-graduate")
public interface CompanyConfFeign {
    @PostMapping("/selectCompany")
    JsonResponse<CompanyConf> select(@RequestBody CompanyConf companyConf);
}
