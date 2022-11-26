package org.example.task2and3.users;

public class UserAdapter implements UniversalUser{
    private final User user;

    public UserAdapter(User user) {
        this.user = user;
    }


    @Override
    public String getUserEmail() {
        if (user instanceof TwitterUser) {
            return ((TwitterUser) user).getUserMail();
        } else if (user instanceof FacebookUser) {
            return ((FacebookUser) user).getEmail();
        }
        return null;
    }

    @Override
    public String getUserCountry() {
        if (user instanceof TwitterUser) {
            return ((TwitterUser) user).getCountry();
        } else if (user instanceof FacebookUser) {
            if (((FacebookUser) user).getUserCountry() == null)
                return null;

            String cntry = null;
            switch (((FacebookUser) user).getUserCountry()) {
                case USA -> cntry = "USA";
                case Poland -> cntry = "Poland";
                case Ukraine -> cntry = "Ukraine";
            }
            return cntry;
        }
        return null;
    }

    @Override
    public String getUserLastActiveTime() {
        if (user instanceof TwitterUser) {
            return ((TwitterUser) user).getLastActiveTime();
        } else if (user instanceof FacebookUser) {
            return ((FacebookUser) user).getGetUserActiveTime().toString();
        }
        return null;
    }
}
