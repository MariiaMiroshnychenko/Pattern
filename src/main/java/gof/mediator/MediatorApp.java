package gof.mediator;

import gof.mediator.example.chat.entity.TextChat;
import gof.mediator.example.user.entity.Administrator;
import gof.mediator.example.user.entity.SimpleUser;
import gof.mediator.example.user.entity.User;

public class MediatorApp {
    public static void main(String[] args) {
        TextChat textChat = new TextChat();

        User admin = new Administrator(textChat, "Admin");
        User firstUser = new SimpleUser(textChat, "Jane");
        User secondUser = new SimpleUser(textChat, "Mary");
        User thirdUser = new SimpleUser(textChat, "Kate");

        secondUser.setEnable(false);

        textChat.setAdministrator(admin);
        textChat.addUser(firstUser);
        textChat.addUser(secondUser);
        textChat.addUser(thirdUser);

        firstUser.sendMessage("Hello, I'm Jane!");
//        secondUser.sendMessage("Hello, I'm Mary!");
        admin.sendMessage("Hello, I'm Admin!");
    }
}
