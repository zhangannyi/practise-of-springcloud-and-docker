package fun.liwudi.graduatedesignuserinfomanage.service.impl;

import fun.liwudi.graduatedesignuserinfomanage.domain.UserInfo;
import fun.liwudi.graduatedesignuserinfomanage.mapper.UserManageMapper;
import fun.liwudi.graduatedesignuserinfomanage.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李武第
 */
@Service
public class UserManageServiceImpl implements UserManageService {

    @Autowired
    private UserManageMapper userManageMapper;

    @Override
    public void addCompanyConf(UserInfo userInfo) {
        userManageMapper.addUserInfo(userInfo);
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        userManageMapper.deleteUserInfo(userInfo);
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        userManageMapper.updateUserInfo(userInfo);
    }

    @Override
    public UserInfo selectUserInfo(UserInfo userInfo) {
        return userManageMapper.selectUserInfo(userInfo);
    }

    @Override
    public List<UserInfo> selectUserInfos(UserInfo userInfo) {
        return userManageMapper.selectUserInfos(userInfo);
    }
}
