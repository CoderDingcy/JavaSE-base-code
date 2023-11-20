package day8;

public class UserNameException extends RuntimeException {

    public UserNameException(String userName) {
        super(userName);
    }
}
