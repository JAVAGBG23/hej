package dependency_inversion;

public class Main {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
    }
}
