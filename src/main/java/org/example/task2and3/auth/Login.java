package org.example.task2and3.auth;

import org.example.task2and3.users.FacebookUser;
import org.example.task2and3.users.TwitterUser;
import org.example.task2and3.users.UserAdapter;

public class Login {
    private UserAdapter user;
    private MessageSender msgSender;

    public Login() {
        msgSender = new MessageSender();
    }

    public void login(String method) {
        if (method.equals("twitter")) {
            user = new UserAdapter(new TwitterUser());
        } else if (method.equals("facebook")) {
            user = new UserAdapter(new FacebookUser());
        }

        msgSender.send("User successfully logged in", user, user.getUserCountry());

    }
}
