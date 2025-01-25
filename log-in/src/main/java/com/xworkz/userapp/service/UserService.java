package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.UserDto;

public interface UserService {

    boolean validateUser(UserDto userDto);
    UserDto getUserById(int id);
}
