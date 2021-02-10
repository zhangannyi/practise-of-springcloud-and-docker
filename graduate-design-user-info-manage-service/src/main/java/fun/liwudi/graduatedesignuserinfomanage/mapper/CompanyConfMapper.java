package fun.liwudi.graduatedesignuserinfomanage.mapper;

import fun.liwudi.graduatedesignuserinfomanage.domain.CompanyConf;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author 李武第
 */
@Mapper
public interface CompanyConfMapper {

    void addCompanyConf(CompanyConf companyConf);
    void deleteCompanyConf(CompanyConf companyConf);
    void updateCompanyConf(CompanyConf companyConf);
    CompanyConf selectCompanyConf(CompanyConf companyConf);
    List<CompanyConf> selectCompanyConfs(CompanyConf companyConf);
}

