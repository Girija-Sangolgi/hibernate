package com.xworkz.userapp.dao;

import com.xworkz.userapp.dto.UserDto;

public interface UserDao {

    boolean saveUser(UserDto userDto);
    UserDto getUserById(int id);
}
