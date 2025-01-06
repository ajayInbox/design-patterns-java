package factory;

import product.Notification;
import product.impl.EmailNotification;
import product.impl.SMSNotification;

public abstract class NotificationFactory {

    public NotificationFactory(){}

    public String callSend(){
        Notification notification = createNotification();
        return notification.send();
    }

    public abstract Notification createNotification();

    public static Notification getInstance(String type, String header, String body ){
        return switch (type) {
            case "SMS" -> new SMSNotification(header, body);
            case "Email" -> new EmailNotification(header, body);
            default -> throw new IllegalArgumentException("type is not correct");
        };
    }
}
