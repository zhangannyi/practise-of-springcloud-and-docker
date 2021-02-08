package fun.liwudi.eurekaclient.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张安熠
 */
@RestController
public class LoginRest {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(){
        return null;
    }
}
