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

class Logger {
    public void log(String message) {
        System.out.println("Save to log: " + message);
    }
}

class EmailSender {
    public void sendWelcomeEmail(String userName) {
        System.out.println("Send welcome email to " + userName);
    }
}
