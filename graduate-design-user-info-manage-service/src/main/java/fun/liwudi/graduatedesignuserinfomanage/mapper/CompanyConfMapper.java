package fun.liwudi.graduatedesignuserinfomanage.mapper;

import fun.liwudi.graduatedesignuserinfomanage.domain.CompanyConf;

/**
 * @author 李武第
 */
public interface CompanyConfMapper {

    void addCompanyConf(CompanyConf companyConf);
    void deleteCompanyConf(CompanyConf companyConf);
    void updateCompanyConf(CompanyConf companyConf);
    void selectCompanyConf(CompanyConf companyConf);

}
