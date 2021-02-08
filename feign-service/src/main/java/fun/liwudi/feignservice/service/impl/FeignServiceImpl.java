package fun.liwudi.feignservice.service.impl;

import fun.liwudi.feignservice.feign.HiFeign;
import fun.liwudi.feignservice.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李武第
 */
@Service
public class FeignServiceImpl implements FeignService {

    @Autowired
    HiFeign hiFeign;

    @Override
    public String feignHi(String name) {
        return hiFeign.helloWorldEurekaClient(name);
    }
}
