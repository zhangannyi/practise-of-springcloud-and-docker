package fun.liwudi.springboot.Rest;

import fun.liwudi.springboot.Mapper.GirlMapper;
import fun.liwudi.springboot.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 李武第
 */
@RestController
public class GirlRest {
    @Autowired
    private GirlMapper girlMapper;

    /**
     * select all girls
     * @return
     */
    @GetMapping("/girls")
    public List<Girl> getGirls(){
        return girlMapper.findAll();
    }

    @PostMapping("/addGirl")
    public Girl addGirl(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlMapper.save(girl);
    }
}
