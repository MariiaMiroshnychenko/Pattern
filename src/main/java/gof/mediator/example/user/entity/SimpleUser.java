package gof.mediator.example.user.entity;

import gof.mediator.example.chat.entity.Chat;

public class SimpleUser extends User {
    public SimpleUser(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("User " + getName() + " is getting message: \"" + message + "\"");
    }
}
