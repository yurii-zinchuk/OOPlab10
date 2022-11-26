package org.example.task2and3.auth;

public class Authorisation {
    public boolean authorise(Database db) {
        db.getUserData();
        return true;
    }
}
