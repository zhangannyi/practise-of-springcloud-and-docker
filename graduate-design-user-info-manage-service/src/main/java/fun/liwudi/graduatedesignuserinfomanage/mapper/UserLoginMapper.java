package fun.liwudi.graduatedesignuserinfomanage.mapper;

import fun.liwudi.graduatedesignuserinfomanage.domain.UserInfo;
import fun.liwudi.graduatedesignuserinfomanage.domain.UserLogin;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 李武第
 */
@Mapper
public interface UserLoginMapper {
    /**
     * query info by info user input
     * @param userLogin
     * @return
     */
    UserInfo getUserInfoByIndex(UserLogin userLogin);
}
