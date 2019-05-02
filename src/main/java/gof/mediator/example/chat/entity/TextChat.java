package gof.mediator.example.chat.entity;

import gof.mediator.example.user.entity.Administrator;
import gof.mediator.example.user.entity.SimpleUser;
import gof.mediator.example.user.entity.User;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {
    User administrator;

    List<User> users = new ArrayList<>();

    public void setAdministrator(User administrator) {
        if (administrator != null && administrator instanceof Administrator) {
            this.administrator = administrator;
        } else {
            throw new RuntimeException("Not enough rights");
        }
    }

    public void addUser(User user) {
        if (administrator == null) {
            throw new RuntimeException("This is no administrator in chat");
        }

        if (user instanceof SimpleUser) {
            users.add(user);
        } else {
            throw new RuntimeException("Administrator can't enter another chat");
        }
    }

    @Override
    public void sendMessage(String message, User user) {
        if (user instanceof Administrator) {
            for (User chatUser : users) {
                chatUser.getMessage(user.getName() + ": " + message);
            }
        }
        if (user instanceof SimpleUser) {
            for (User chatUser : users) {
                if (chatUser != user && chatUser.isEnable()) {
                    chatUser.getMessage(user.getName() + ": " + message);
                }
            }
            if (administrator.isEnable()) {
                administrator.getMessage(user.getName() + ": " + message);
            }
        }
    }
}
