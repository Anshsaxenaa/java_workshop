public class Main {
    public static void main(String[] args) {
        NotificationService service = new EmailService();
        service.sendWithRetry("Hello", 3);

    }
}