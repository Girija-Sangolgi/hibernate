package com.xworkz.register.service;

import com.xworkz.register.dto.RegisterDto;

public interface RegisterService {

    boolean validateUser(RegisterDto registerDto);
    RegisterDto getAllUsers(int id);
}
