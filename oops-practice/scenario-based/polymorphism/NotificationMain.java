package scenarioBased;

public class NotificationMain {

    public static void display() {

        Notification[] notifications = {

                new EmailNotification("Arpit", "Welcome to our website."),
                new SMSNotification("Rahul", "Your OTP is 123456."),
                new PushNotification("Aman", "Your order has been delivered.")
        };

        for (Notification n : notifications) {
            n.sendNotification();      // Dynamic Method Dispatch
        }
    }

    public static void main(String[] args) {
        display();
    }
}