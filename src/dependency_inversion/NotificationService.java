package dependency_inversion;

public class NotificationService {
   private MessageService messageService;

    public NotificationService(MessageService messageService) {
        this.messageService = messageService;

    }

    public void sendNotification(String message){
      messageService.sendMessage(message);
    }
}

interface MessageService {
    void sendMessage(String message);
}
