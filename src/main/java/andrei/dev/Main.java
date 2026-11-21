package andrei.dev;

import andrei.dev.config.AppConfig;
import andrei.dev.service.UserMessagePrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserMessagePrinter userMessagePrinter = context.getBean(UserMessagePrinter.class);

        userMessagePrinter.printMessage("Андрей");
    }
}