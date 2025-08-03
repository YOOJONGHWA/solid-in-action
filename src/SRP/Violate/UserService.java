package SRP.Violate;

public class UserService {

    public void registerUser(String userName, String password) {

        System.out.println("Register user: " + userName);

        System.out.println("save to log:" + userName);

        System.out.println("Send welcome email to " +userName);

        /*
        *   what's wrong?
        *   UserService class have 3 principal
        *   1. Register user
        *   2. save log
        *   3. send email
        *
        *   if someone chang then maybe get effict antoher things too
        * */

    }
}
