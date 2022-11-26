import org.example.task2and3.users.Country;
import org.example.task2and3.users.FacebookUser;
import org.example.task2and3.users.TwitterUser;
import org.example.task2and3.users.UserAdapter;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Task23Test {
    private TwitterUser user1;
    private FacebookUser user2;


    @Test
    public void testAdapter() {
        user1 = new TwitterUser("user1@a.b.c", "Ukraine", "12:30");
        user2 = new FacebookUser("user2@a.b.c", Country.Ukraine, LocalTime.parse("12:30"));
        List<UserAdapter> users = new ArrayList<>();
        users.add(new UserAdapter(user1));
        users.add(new UserAdapter(user2));

        for (UserAdapter user :
                users) {
            System.out.println(user.getUserCountry());
            System.out.println(user.getUserEmail());
            System.out.println(user.getUserLastActiveTime());
        }
    }
}
