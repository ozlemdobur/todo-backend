package org.itforus.todo.services;

import org.itforus.todo.model.UserDB;

import java.util.Optional;

public interface UserService {

    UserDB userSave(UserDB userDB);
    void userDelete(Long id);
    Iterable <UserDB> usersList();

}
