package product.impl;

import product.Notification;

public class SMSNotification extends Notification {
    public SMSNotification(String header, String body) {
        super(header, body);
    }

    public SMSNotification(){}

    @Override
    public String send() {
        return "Sending SMS!";
    }
}
