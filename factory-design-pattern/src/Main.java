import factory.EmailNotificationFactory;
import factory.NotificationFactory;
import factory.SMSNotificationFactory;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();

        if(type.equals("SMS")){
            NotificationFactory factory = new SMSNotificationFactory();
            System.out.println(factory.callSend());
        }

        if(type.equals("Email")){
            NotificationFactory factory = new EmailNotificationFactory();
            System.out.println(factory.callSend());
        }
    }
}