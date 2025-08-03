package DIP.Violate;

public class NotificationService {
    private final EmailSender emailSender;

    public NotificationService() {
        this.emailSender = new EmailSender();  // ❌ 직접 의존
    }

    public void notify(String message) {
        emailSender.send(message);
    }
}



