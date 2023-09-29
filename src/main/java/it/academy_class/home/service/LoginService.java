package it.academy_class.home.service;

import it.academy_class.home.model.entity.User;
import it.academy_class.home.model.repository.UserRepository;

import java.util.List;

public class LoginService {
    private static final LoginService LOGIN_SERVICE = new LoginService();

    private LoginService(){
    }

    public static LoginService getLoginService(){
        return LOGIN_SERVICE;
    }
    public boolean checkCredentials(String login, String password){
        List<User> users = UserRepository.getUserRepository().getUsers();
        for(User user : users){
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}

