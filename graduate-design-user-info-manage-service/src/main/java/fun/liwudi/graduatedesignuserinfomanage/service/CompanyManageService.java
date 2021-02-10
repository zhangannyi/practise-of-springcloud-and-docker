package fun.liwudi.graduatedesignuserinfomanage.service;

import fun.liwudi.graduatedesignuserinfomanage.domain.CompanyConf;

import java.util.List;

/**
 * @author 李武第
 */
public interface CompanyManageService {

    /**
     * add
     * @param companyConf
     */
    void addCompanyConf(CompanyConf companyConf);

    /**
     * delete
     * @param companyConf
     */
    void deleteCompanyConf(CompanyConf companyConf);

    /**
     * update
     * @param companyConf
     */
    void updateCompanyConf(CompanyConf companyConf);

    /**
     * select one
     * @param companyConf
     * @return
     */
    CompanyConf selectCompanyConf(CompanyConf companyConf);

    List<CompanyConf> selectCompanyConfs(CompanyConf companyConf);
}
