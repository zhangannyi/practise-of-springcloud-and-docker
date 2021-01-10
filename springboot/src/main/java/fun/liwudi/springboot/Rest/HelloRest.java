package fun.liwudi.springboot.Rest;

import fun.liwudi.springboot.domain.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李武第
 */
@RestController
public class HelloRest {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    public String say(){
        return "hi you!!!"+girlProperties.toString();
    }
}
