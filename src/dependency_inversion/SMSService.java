package dependency_inversion;

class SMSService implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS with message " + message);
    }
}
