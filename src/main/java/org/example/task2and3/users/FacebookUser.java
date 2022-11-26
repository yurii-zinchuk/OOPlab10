package org.example.task2and3.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

enum Country {
    Ukraine, USA, Poland;
}

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FacebookUser extends User{
    private String email;
    private Country userCountry;
    private LocalDate getUserActiveTime;
}
