package fun.liwudi.graduatedesignuserinfomanage.service;

import fun.liwudi.graduatedesignuserinfomanage.domain.CheckInfo;

/**
 * @author 李武第
 */
public interface CheckInfoService {

    void addCheckInfo(CheckInfo checkInfo);
    CheckInfo selectOneCheckInfo(CheckInfo checkInfo);
    java.util.List<CheckInfo> selectCheckInfosByUserCode(CheckInfo checkInfo);
    java.util.List<CheckInfo> selectCheckInfosByCompanyCode(CheckInfo checkInfo);
}
