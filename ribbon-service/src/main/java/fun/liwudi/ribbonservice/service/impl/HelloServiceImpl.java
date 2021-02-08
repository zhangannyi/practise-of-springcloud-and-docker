package fun.liwudi.ribbonservice.service.impl;

import fun.liwudi.ribbonservice.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.Action;

/**
 * @author 李武第
 */
@Service
public class HelloServiceImpl implements HelloService{

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name="+name,String.class);
    }
}
