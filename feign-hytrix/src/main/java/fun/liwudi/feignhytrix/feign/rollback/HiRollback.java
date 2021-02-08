package fun.liwudi.feignhytrix.feign.rollback;

import fun.liwudi.feignhytrix.feign.HiFeign;
import org.springframework.stereotype.Component;
import sun.misc.Contended;

/**
 * @author 李武第
 */
@Component
public class HiRollback implements HiFeign {
    @Override
    public String helloWorldEurekaClient(String name) {
        return "hi, "+name+" error, sorry!";
    }
}
