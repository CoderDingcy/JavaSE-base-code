package day8;

public class Main {

    public static void main(String[] args) {
        LogIn li=new LogIn();
        li.logIn("admin","123456");

    }

}

class LogIn {

    private String userName = "admin";
    private String password = "123456";

    void logIn(String userName, String password) {

        if (!userName.equals(this.userName)) {
            throw new UserNameException(userName);
        }

        if (!password.equals(this.password)) {

            throw new PasswordException(password);
        }

    }


}


