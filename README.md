
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

Feel free to customize the section headers, descriptions, or any other part of the README to better suit your project's needs.
