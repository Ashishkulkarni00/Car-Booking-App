package com.ride_booking_system.controller;


import com.ride_booking_system.model.User;
import com.ride_booking_system.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private UserService userService = UserService.getInstance();

    @PostMapping("/add-user")
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return "new user has been added";
    }


    @GetMapping("/get-all-users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/get-by-name/{name}")
    public User getUserByName(@PathVariable ("name") String name){
        return userService.getUserByName(name);
    }

    @PutMapping("/update-by-name/{name}")
    public User updateUserByName(@PathVariable ("name") String name, @RequestBody User user){
        return userService.updateUserByName(name,user);
    }

}
