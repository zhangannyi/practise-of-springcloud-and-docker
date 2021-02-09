package fun.liwudi.eurekaclient.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李武第
 */
@RestController
public class LoginRest {

    @RequestMapping("/login")
    public String login(@RequestParam("name") String name,@RequestParam("password") String password){
       if(password.equals("lwd")) {
           return "success to login";
       }
       else{
           return "fail to login";
       }
    }

    public static void main(String[] args) {
        LoginRest loginRest = new LoginRest();
        System.out.println(loginRest.login("anyi","anyi"));
    }
}


