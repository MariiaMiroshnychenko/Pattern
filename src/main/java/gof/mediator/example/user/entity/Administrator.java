package gof.mediator.example.user.entity;

import gof.mediator.example.chat.entity.Chat;

public class Administrator extends User {

    public Administrator(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Administrator " + getName() + " is getting message: \"" + message + "\"");
    }
}
