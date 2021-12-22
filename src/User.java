public class User {
    private String userName;// שם משתמש
    private String password;// סיסמה
    private String phoneNumber;// מספר פלאפון
    private String OrdinaryBrokerOrUser; // מתווך או משתמש רגיל

    public String getOrdinaryBrokerOrUser() {
        return OrdinaryBrokerOrUser;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setOrdinaryBrokerOrUser(String ordinaryBrokerOrUser) {
        OrdinaryBrokerOrUser = ordinaryBrokerOrUser;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}

