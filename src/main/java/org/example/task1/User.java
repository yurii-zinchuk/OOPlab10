package org.example.task1;

import lombok.Getter;
import lombok.Setter;

public class User {
    @Getter
    private String name;
    @Getter
    private String email;
    @Getter
    private Integer age;
    private Integer id;

    @Setter
    private Database DB;

    public User(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public void save() {
        DB.addEntry(this);
    }
}
