package fun.liwudi.graduatedesignverifyservice.domain;

/**
 * @author 李武第
 */
public class UserConf {
    String companyCode;
    String userCode;

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    @Override
    public String toString() {
        return "UserConf{" +
                "companyCode='" + companyCode + '\'' +
                ", userCode='" + userCode + '\'' +
                '}';
    }
}
