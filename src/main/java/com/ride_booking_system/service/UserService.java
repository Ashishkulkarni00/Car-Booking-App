package com.ride_booking_system.service;

import com.ride_booking_system.exception.UserNotFoundException;
import com.ride_booking_system.repository.DriverRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ride_booking_system.model.User;
import com.ride_booking_system.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Component
public class UserService {
    private static UserService userService;

    public static UserService getInstance(){
        if(userService == null){
            userService = new UserService();
            return userService;
        }
        return userService;
    }

    private UserService(){

    }

    public User updateUserByName(String name, User user){
        List<User> users = userRepository.getAllUsers();
        User existingUser = null;
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getName().equals(name)){
                existingUser = users.get(i);
                users.remove(i);
                break;
            }
        }

        if(existingUser == null) throw new UserNotFoundException("User not found");

        existingUser.setName(user.getName());
        existingUser.setAge(user.getAge());
        existingUser.setGender(user.getGender());
        userRepository.addUser(existingUser);
        return existingUser;

    }

    private UserRepository userRepository = UserRepository.getInstance();
    public void addUser(User user){
        userRepository.addUser(user);
    }

    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }

    public User getUserByName(String name){
        return userRepository.getByName(name);
    }

}

