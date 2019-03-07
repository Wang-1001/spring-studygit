package com.spring.quickstart.work;

public class UserLogin {

    private User user;

    public UserLogin(User user) {
        this.user = user;
    }

    public UserLogin() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "UserLogin{" +
                "user=" + user +
                '}';
    }

    public boolean userLogin(User user){
        if (user.getAccount().equals("admin") && user.getPassword().equals("111")){
            return true;
        }
        return false;
    }
}
