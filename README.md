# Car Booking System

The Car Booking System is a Java and Spring Boot-based application that facilitates the management of users, drivers, and ride bookings. The system allows users to add and update their profiles, search for available drivers, and book rides. Additionally, drivers can be added or updated, and their availability status can be tracked.

## Features

- **User Management:** Add, update, and retrieve user information, including name, gender, and age.

- **Driver Management:** Manage driver details, such as name, gender, age, car information, and availability status.

- **Ride Booking:** Find available rides based on user preferences, source, and destination coordinates.

## Getting Started

To run the Car Booking System locally, follow these steps:

1. Clone the repository: `git clone [repository_link]`
2. Navigate to the project directory: `cd Car-Booking-System`
3. Run the application: `./mvnw spring-boot:run`
4. Access the system at `http://localhost:8080`

## API Endpoints

### Users

- Add User: `POST /api/v1/users/add-user`
- Update User: `PUT /api/v1/users/update-by-name/{name}`
- Get All Users: `GET /api/v1/users/get-all-users`
- Get User by Name: `GET /api/v1/users/get-by-name/{name}`

### Drivers

- Add Driver: `POST /api/v1/drivers/add-driver`
- Update Driver: `PUT /api/v1/drivers/update-by-name/{name}`
- Get All Drivers: `GET /api/v1/drivers/get-all-drivers`

### Rides

- Find Rides: `POST /api/v1/rides/find-rides`
- Choose Ride: `GET /api/v1/rides/choose-ride/{userName}/{driverName}`





# Car Booking System Documentation

## Users

### Add User

- **Endpoint:** `POST /api/v1/users/add-user`
- **Body:**
  ```json
  {
      "name": "Nandini",
      "gender": "M",
      "age": 24
  }
  ```

### Update User

- **Endpoint:** `PUT /api/v1/users/update-by-name/Abhishek`
- **Body:**
  ```json
  {
      "name": "Abhishek",
      "gender": "M",
      "age": 50
  }
  ```

### Get All Users

- **Endpoint:** `GET /api/v1/users/get-all-users`

### Get User by Name

- **Endpoint:** `GET /api/v1/users/get-by-name/Ashish`

## Drivers

### Add Driver

- **Endpoint:** `POST /api/v1/drivers/add-driver`
- **Body:**
  ```json
  {
    "name": "Driver3",
    "gender": "M",
    "age": 30,
    "carNumber": "KA-01-12345",
    "carName" : "Swift",
    "currentLocation": [5, 3],
    "isAvailable": true
  }
  ```

### Update Driver

- **Endpoint:** `PUT /api/v1/drivers/update-by-name/Driver2`
- **Body:**
  ```json
  {
      "name": "Driver2",
      "gender": "M",
      "age": 29,
      "carNumber": "KA-01-12345",
      "carName": "Swift",
      "currentLocation": [11, 10],
      "isAvailable": false
  }
  ```

### Get All Drivers

- **Endpoint:** `GET /api/v1/drivers/get-all-drivers`

## Rides

### Find Rides

- **Endpoint:** `POST /api/v1/rides/find-rides`
- **Body:**
  ```json
  {
    "userName": "Nandini",
    "source": [16, 6],
    "destination": [20, 4]
  }
  ```

### Choose Ride

- **Endpoint:** `GET /api/v1/rides/choose-ride/Nandini/Driver2`


