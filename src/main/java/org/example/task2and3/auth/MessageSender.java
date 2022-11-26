package org.example.task2and3.auth;

import org.example.task2and3.users.UserAdapter;

import java.time.LocalTime;

public class MessageSender {
    public void send(String text, UserAdapter user, String country) {
        String msg = "Message with text :\n<<" + text + ">>\nWas sent to user with email: " +
                user.getUserEmail() + "\nFrom country " + country;

        if (user.getUserCountry() != null && country.equals("Ukraine"))
            if (LocalTime.from(LocalTime.parse(user.getUserLastActiveTime())).compareTo(LocalTime.of(1, 0)) > 0)
                System.out.println(msg);

    }
}
