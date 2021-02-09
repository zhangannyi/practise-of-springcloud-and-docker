package fun.liwudi.graduatedesignuserinfomanage.domain;

/**
 * @author 李武第
 */
public class UserLogin {
    String userCode;
    String passWord;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "userCode='" + userCode + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
