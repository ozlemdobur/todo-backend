package org.itforus.todo.services;


import org.itforus.todo.model.UserDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.itforus.todo.repository.UserRepository;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDB userSave(UserDB userDB) {

        UserDB newUserDB = userRepository.save(userDB);
        return newUserDB;

    }

    @Override
    public void userDelete(Long id) {

        userRepository.deleteById(id);

    }

    @Override
    public Iterable<UserDB> usersList() {

        Iterable<UserDB> userList = userRepository.findAll();
        return userList;

    }

}
