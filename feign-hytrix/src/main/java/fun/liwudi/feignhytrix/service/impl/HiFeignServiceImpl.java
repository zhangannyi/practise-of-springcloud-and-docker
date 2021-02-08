package fun.liwudi.feignhytrix.service.impl;

import fun.liwudi.feignhytrix.feign.HiFeign;
import fun.liwudi.feignhytrix.service.HiFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiFeignServiceImpl implements HiFeignService {

    @Autowired
    HiFeign hiFeign;

    @Override
    public String hiFeignWithRollBack(String name) {
        return hiFeign.helloWorldEurekaClient(name);
    }
}
