package com.ride_booking_system.repository;



import com.ride_booking_system.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

    private List<User> userList;

    private static UserRepository userRepository;

    private UserRepository(){
        this.userList = new ArrayList<>();
    }

    public String getUtilityData(){
        return userList.size() +"";
    }
    public static UserRepository getInstance(){
        if(userRepository == null){
            userRepository = new UserRepository();
            return userRepository;
        }
        return userRepository;
    }


    public List<User> getAllUsers(){
        return this.userList;
    }

    public void addUser(User user) {
        this.userList.add(user);
    }

    public User getByName(String name) {
        if(userList == null) {
            return null;
        }
        User user = null;
        for(int i = 0; i < userList.size();i++){
            if(userList.get(i).getName().equals(name)){
                user = userList.get(i);
                break;
            }
        }
        return user;
    }


}
