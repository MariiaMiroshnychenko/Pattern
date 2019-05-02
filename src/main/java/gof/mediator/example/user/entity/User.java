package gof.mediator.example.user.entity;

import gof.mediator.example.chat.entity.Chat;

public abstract class User {
    Chat chat;
    String name;
    boolean isEnable = true;

    public void setName(String name) {
        this.name = name;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    public boolean isEnable() {
        return isEnable;
    }

    public abstract void getMessage(String message);
}
