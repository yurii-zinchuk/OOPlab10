package org.example.task1;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance();

        User vasa = new User("Vasyl", "vasyok@a.b.c", 12);
        vasa.setDB(database);
        vasa.save();

        User petya = new User("Peter", "petryk@a.b.c", 11);
        petya.setDB(database);
        petya.save();

        User styopa = new User("Stepan", "stepanko@a.b.c", 13);
        styopa.setDB(database);
        styopa.save();
    }
}