package org.example.task2and3.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FacebookUser extends User{
    private String email;
    private Country userCountry;
    private LocalTime getUserActiveTime;
}
