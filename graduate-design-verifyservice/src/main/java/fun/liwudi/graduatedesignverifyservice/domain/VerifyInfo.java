package fun.liwudi.graduatedesignverifyservice.domain;

import java.math.BigDecimal;

/**
 * @author 李武第
 */
public class VerifyInfo {
    String userCode;
    BigDecimal checkAreaX;
    String checkIp;
    BigDecimal checkAreaY;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
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

    @Override
    public String toString() {
        return "VerifyInfo{" +
                "userCode='" + userCode + '\'' +
                ", checkAreaX=" + checkAreaX +
                ", checkIp='" + checkIp + '\'' +
                ", checkAreaY=" + checkAreaY +
                '}';
    }
}
