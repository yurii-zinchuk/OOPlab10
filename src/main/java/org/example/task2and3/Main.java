package org.example.task2and3;

import org.example.task2and3.auth.Authorisation;
import org.example.task2and3.auth.Database;
import org.example.task2and3.auth.Login;
import org.example.task2and3.auth.ReportBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorisation authorisation = new Authorisation();
        if (authorisation.authorise(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
        Login lg = new Login();
        Scanner in = new Scanner(System.in);
        int option;

        for (;;) {
            System.out.println("Select login method: twitter(1) or facebook(2)");
            option = in.nextInt();
            if (option == 1)
                lg.login("twitter");
            else if (option == 2)
                lg.login("facebook");
            else
                System.out.println("Wrong method");
            System.out.println();
        }

    }
}
