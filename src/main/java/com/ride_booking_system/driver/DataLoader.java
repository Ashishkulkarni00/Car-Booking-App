package com.ride_booking_system.driver;


import com.ride_booking_system.model.Driver;
import com.ride_booking_system.model.User;
import com.ride_booking_system.repository.DriverRepository;
import com.ride_booking_system.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {


        User user1 = new User("Abhishek",'M',23);
        User user2 = new User("Rahul",'M',29);
        User user3 = new User("Nandini",'M',22);

        UserRepository userRepository = UserRepository.getInstance();

        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(user3);


        List<User> userList = userRepository.getAllUsers();

        for(int i = 0; i < userList.size();i++){
            System.out.print(userList.get(i).getName() + " ");
        }

        System.out.println();

// ----------------------------------DRIVER--------------------------------------------------------------------DRIVER--------------------------------------------------------------------DRIVER----------------------------------



        int[] driver1Location = {10,1};
        Driver driver1 = new Driver("Driver1",'M',22,"KA-01-12345", "Swift", driver1Location,true);
        int[] driver2Location = {11,10};
        Driver driver2 = new Driver("Driver2",'M',29,"KA-01-12345", "Swift",driver2Location,true);
        int[] driver3Location = {5,3};
        Driver driver3 = new Driver("Driver3",'M',24,"KA-01-12345", "Swift",driver3Location,true);

        DriverRepository driverRepository = DriverRepository.getInstance();

        driverRepository.addDriver(driver1);
        driverRepository.addDriver(driver2);
        driverRepository.addDriver(driver3);

        List<Driver> driverList = driverRepository.getAllDrivers();

        for(int i = 0; i < driverList.size(); i++){
            System.out.print(driverList.get(i).getName()+" ");
        }

        System.out.println();
        System.out.println("All the Data has been inserted correctly");

//      ----------------------------------BOOK RIDE--------------------------------------------------------------------BOOK RIDE--------------------------------------------------------------------BOOK RIDE----------------------------------


    }
}



