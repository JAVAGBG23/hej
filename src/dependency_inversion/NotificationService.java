package dependency_inversion;

public class NotificationService {
    private EmailService emailService;
    private SMSService smsService;

    public NotificationService(EmailService emailService, SMSService smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
    }

    public void hej() {
        System.out.println("hej");
    }

    public void sendNotification(String message){
        emailService.sendMessage(message);
        smsService.sendSMS(message);
    }
}
