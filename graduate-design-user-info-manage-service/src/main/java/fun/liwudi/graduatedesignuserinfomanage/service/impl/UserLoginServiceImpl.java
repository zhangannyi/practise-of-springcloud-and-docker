package fun.liwudi.graduatedesignuserinfomanage.service.impl;

import fun.liwudi.graduatedesignuserinfomanage.constants.Constants;
import fun.liwudi.graduatedesignuserinfomanage.domain.JsonResponse;
import fun.liwudi.graduatedesignuserinfomanage.domain.UserLogin;
import fun.liwudi.graduatedesignuserinfomanage.helper.JsonResponseHelper;
import fun.liwudi.graduatedesignuserinfomanage.mapper.UserLoginMapper;
import fun.liwudi.graduatedesignuserinfomanage.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author 李武第
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    UserLoginMapper userLoginMapper;

    @Autowired
    JsonResponseHelper jsonResponseHelper;

    @Override
    public JsonResponse login(UserLogin userLogin) {
        return Objects.nonNull(userLoginMapper.getUserInfoByIndex(userLogin))?
                jsonResponseHelper.getJsonResponse(Constants.SUCCESS,0): jsonResponseHelper.getJsonResponse(Constants.FAIL,1);
    }
}
