package excercise13Test;

import java.util.Objects;

public class User {

    private String userName, password;
    private boolean userNameCheck;
    private String typeOfUser = "normal";
    private int loginCount = 0;

    public User (String userName, String password,boolean userNameCheck) {
        this.userName = userName;
        this.password = password;
        this.userNameCheck = userNameCheck;

    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.userNameCheck = userName.length() >=8;
    }

    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        if (userName.length()>=4){
        this.userName = userName;
        this.userNameCheck = userName.length() >=8;
    }
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        if(password.length()>=7 && password.length()<=20){
            this.password = password;
        }
    }

    public boolean isUserNameCheck() {
        return userNameCheck;
    }

    public String getTypeOfUser() {return typeOfUser;}
    public void setTypeOfUser(String typeOfUser) {
        if(Objects.equals(typeOfUser, "admin") || Objects.equals(typeOfUser, "normal") || Objects.equals(typeOfUser, "super" ) || Objects.equals(typeOfUser,"gold member")) {
            this.typeOfUser = typeOfUser;
        }
    }

    public void login(){
        loginCount++;
        if(loginCount>=20){
            typeOfUser="gold";
        }
    }

    /*public int getLoginCount() {
        return loginCount;
    }

     */

    public String getPassDigit(){
        return password;
    }
    public void setPassDigit(String password){
        if(password.matches(".*[456435!%$#&].*") &&
            password.matches("(?=.*[A-Z])(?=.*[a-z]).*")){
            this.password = password;
        }
    }



}

