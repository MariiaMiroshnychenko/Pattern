package gof.mediator.example.chat.entity;

import gof.mediator.example.user.entity.User;

public interface Chat {
    void sendMessage(String message, User user);
}
