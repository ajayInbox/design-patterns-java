package product.impl;

import product.Notification;

public class EmailNotification extends Notification {
    public EmailNotification(String header, String body) {
        super(header, body);
    }

    public EmailNotification(){
        super();
    };

    @Override
    public String send() {
        return "Sending Email!";
    }
}
