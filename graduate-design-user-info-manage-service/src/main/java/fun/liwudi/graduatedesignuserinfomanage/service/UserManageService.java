package fun.liwudi.graduatedesignuserinfomanage.service;


import fun.liwudi.graduatedesignuserinfomanage.domain.UserInfo;

import java.util.List;

/**
 * @author 李武第
 */
public interface UserManageService {

    /**
     * add
     * @param userInfo
     */
    void addCompanyConf(UserInfo userInfo);

    /**
     * delete
     * @param userInfo
     */
    void deleteUserInfo(UserInfo userInfo);

    /**
     * update
     * @param userInfo
     */
    void updateUserInfo(UserInfo userInfo);

    /**
     * select one
     * @param userInfo
     * @return
     */
    UserInfo selectUserInfo(UserInfo userInfo);

    List<UserInfo> selectUserInfos(UserInfo userInfo);
}
