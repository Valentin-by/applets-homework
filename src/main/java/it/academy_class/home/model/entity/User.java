package it.academy_class.home.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class User {
    private String login;
    private String password;
}
