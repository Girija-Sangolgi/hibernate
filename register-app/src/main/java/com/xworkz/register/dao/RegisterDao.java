package com.xworkz.register.dao;

import com.xworkz.register.dto.RegisterDto;

public interface RegisterDao {

    boolean saveUser(RegisterDto registerDto);
    RegisterDto getUserById(int id);
}
