package fun.liwudi.graduatedesignuserinfomanage.service;

import fun.liwudi.graduatedesignuserinfomanage.domain.UserConf;

import java.util.List;

/**
 * @author 李武第
 */
public interface UserCompanyRelationService {

    void addUserToCompany(UserConf userConf);
    void deleteUserCompany(UserConf userConf);
    UserConf selectUserCompany(UserConf userConf);
    List<UserConf> selectByUserCode(UserConf userConf);
    List<UserConf> selectByCompanyCode(UserConf userConf);
}
