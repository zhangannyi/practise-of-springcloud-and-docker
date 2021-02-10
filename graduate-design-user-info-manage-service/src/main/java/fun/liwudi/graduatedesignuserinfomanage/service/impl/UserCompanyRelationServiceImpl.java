package fun.liwudi.graduatedesignuserinfomanage.service.impl;

import fun.liwudi.graduatedesignuserinfomanage.domain.UserConf;
import fun.liwudi.graduatedesignuserinfomanage.mapper.UserCompanyMapper;
import fun.liwudi.graduatedesignuserinfomanage.service.UserCompanyRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李武第
 */
@Service
public class UserCompanyRelationServiceImpl implements UserCompanyRelationService {

    @Autowired
    private UserCompanyMapper userCompanyMapper;

    @Override
    public void addUserToCompany(UserConf userConf) {
        userCompanyMapper.addUserToCompany(userConf);
    }

    @Override
    public void deleteUserCompany(UserConf userConf) {
        userCompanyMapper.deleteUserCompany(userConf);
    }

    @Override
    public UserConf selectUserCompany(UserConf userConf) {
        return userCompanyMapper.selectUserCompany(userConf);
    }

    @Override
    public List<UserConf> selectByUserCode(UserConf userConf) {
        return userCompanyMapper.selectByUserCode(userConf);
    }

    @Override
    public List<UserConf> selectByCompanyCode(UserConf userConf) {
        return userCompanyMapper.selectByCompanyCode(userConf);
    }
}
