package it.academy_class.home.model.repository;

import it.academy_class.home.model.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users;
    private static final UserRepository USER_REPOSITORY = new UserRepository();
    public static UserRepository getUserRepository(){
        return USER_REPOSITORY;
    }

    private UserRepository(){
        users = new ArrayList<>();
        User user1 = new User("admin", "admin");
        User user2 = new User("root", "root");
        users.add(user1);
        users.add(user2);
    }

    public List<User> getUsers(){
        return users;
    }
}
