package SRP;

public class UserServiceSRP {

    private final Logger logger;
    private final EmailSender emailSender;

    public UserServiceSRP(Logger logger, EmailSender emailSender) {
        this.logger = logger;
        this.emailSender = emailSender;
    }

    public void registerUser(String userName, String password) {
        System.out.println("Register user: " + userName);
        logger.log(userName);
        emailSender.sendWelcomeEmail(userName);
    }
}

