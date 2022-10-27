package org.itforus.todo.controller;

import org.itforus.todo.model.UserDB;
import org.itforus.todo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {

        this.userService = userService;

    }

    @PostMapping(value ="/user")
    public ResponseEntity<UserDB> userAdd(@RequestBody UserDB userDB){

    UserDB newUserDB = userService.userSave(userDB);
    return ResponseEntity.ok(newUserDB);

    }

    @GetMapping(value ="/user")
    public ResponseEntity<Iterable<UserDB>> userFind(UserDB userDB){

        Iterable<UserDB> userFind = userService.usersList();
        return ResponseEntity.ok(userFind);

    }

    @DeleteMapping(value ="/user")
    public void userDelete(@RequestParam Long id){

        userService.userDelete(id);

    }

    @PutMapping(value = "/user")
    public ResponseEntity<UserDB> userUpdate(@RequestBody UserDB userDB){

        userService.userSave(userDB);
        return ResponseEntity.ok(userDB);

    }

}
