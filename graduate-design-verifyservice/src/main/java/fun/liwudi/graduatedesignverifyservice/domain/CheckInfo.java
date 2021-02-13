package fun.liwudi.graduatedesignverifyservice.domain;

import java.math.BigDecimal;

/**
 * @author 李武第
 */
public class CheckInfo {

    String userCode;
    int checkSuccess;
    BigDecimal checkAreaX;
    String checkIp;
    BigDecimal checkAreaY;
    String companyCode;
    String checkDate;
    int deleteFlag;

    public int getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(int deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public int getCheckSuccess() {
        return checkSuccess;
    }

    public void setCheckSuccess(int checkSuccess) {
        this.checkSuccess = checkSuccess;
    }

    public BigDecimal getCheckAreaX() {
        return checkAreaX;
    }

    public void setCheckAreaX(BigDecimal checkAreaX) {
        this.checkAreaX = checkAreaX;
    }

    public String getCheckIp() {
        return checkIp;
    }

    public void setCheckIp(String checkIp) {
        this.checkIp = checkIp;
    }

    public BigDecimal getCheckAreaY() {
        return checkAreaY;
    }

    public void setCheckAreaY(BigDecimal checkAreaY) {
        this.checkAreaY = checkAreaY;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate;
    }

    @Override
    public String toString() {
        return "CheckInfo{" +
                "userCode='" + userCode + '\'' +
                ", checkSuccess=" + checkSuccess +
                ", checkAreaX=" + checkAreaX +
                ", checkIp='" + checkIp + '\'' +
                ", checkAreaY=" + checkAreaY +
                ", companyCode='" + companyCode + '\'' +
                ", checkDate='" + checkDate + '\'' +
                ", deleteFlag=" + deleteFlag +
                '}';
    }
}
