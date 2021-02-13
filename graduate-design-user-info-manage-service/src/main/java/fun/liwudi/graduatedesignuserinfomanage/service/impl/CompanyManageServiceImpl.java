package fun.liwudi.graduatedesignuserinfomanage.service.impl;

import fun.liwudi.graduatedesignuserinfomanage.domain.CompanyConf;
import fun.liwudi.graduatedesignuserinfomanage.mapper.CompanyConfMapper;
import fun.liwudi.graduatedesignuserinfomanage.service.CompanyManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李武第
 */
@Service
public class CompanyManageServiceImpl implements CompanyManageService {

    @Autowired
    CompanyConfMapper companyConfMapper;

    @Override
    public void addCompanyConf(CompanyConf companyConf) {
        companyConfMapper.addCompanyConf(companyConf);
    }

    @Override
    public void deleteCompanyConf(CompanyConf companyConf) {
        companyConfMapper.deleteCompanyConf(companyConf);
    }

    @Override
    public void updateCompanyConf(CompanyConf companyConf) {
        companyConfMapper.updateCompanyConf(companyConf);
    }

    @Override
    public CompanyConf selectCompanyConf(CompanyConf companyConf) {
        return companyConfMapper.selectCompanyConf(companyConf);
    }

    @Override
    public List selectCompanyConfs(CompanyConf companyConf) {
        return companyConfMapper.selectCompanyConfs(companyConf);
    }
}
