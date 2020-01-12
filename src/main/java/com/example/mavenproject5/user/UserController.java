package com.example.mavenproject5.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @RequestMapping("/users/{userID}")
    public User getUser(@PathVariable("userID") String userID){
        return userService.getUser(userID);
    }

    @RequestMapping(method= RequestMethod.POST, value="/users")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/users/{userID}")
    public void updateUser(@RequestBody User user, @PathVariable("userID") String userID){
        userService.updateUser(user, userID);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/users/{userID}")
    public void deleteUser(@PathVariable("userID") String userID){
        userService.deleteUser(userID);
    }
}
