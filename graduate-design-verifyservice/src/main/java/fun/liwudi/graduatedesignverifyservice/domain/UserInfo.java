package fun.liwudi.graduatedesignverifyservice.domain;

/**
 * @author 李武第
 */
public class UserInfo {

    String userName;
    String userCode;
    String deleteFlag;
    String passWord;
    String idCard;



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userName='" + userName + '\'' +
                ", userCode='" + userCode + '\'' +
                ", deleteFlag='" + deleteFlag + '\'' +
                ", passWord='" + passWord + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
