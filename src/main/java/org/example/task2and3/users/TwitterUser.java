package org.example.task2and3.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TwitterUser extends User{
    private String userMail;
    private String country;
    private String lastActiveTime;
}
