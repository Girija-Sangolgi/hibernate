package com.xworkz.register.service;

import com.xworkz.register.dao.RegisterDao;
import com.xworkz.register.dao.RegisterDaoImpl;
import com.xworkz.register.dto.RegisterDto;

public class RegisterServiceImpl implements RegisterService{

    RegisterDao dao = new RegisterDaoImpl();

    @Override
    public boolean validateUser(RegisterDto registerDto) {
        boolean userNameValid = false;
        boolean passwordValid = false;
        boolean registerAdded = false;
        if (registerDto != null) {
            if (registerDto.getUserName()!= null && !registerDto.getPassword().isEmpty()) {
                System.out.println("User first name valid");
                userNameValid = true;
            }
            if (registerDto.getPassword()!= null && !registerDto.getUserName().isEmpty()) {
                System.out.println("User last name valid");
                passwordValid= true;
            }
            if (userNameValid && passwordValid) {
               registerAdded = dao.saveUser(registerDto);
                System.out.println("service info: " + registerDto);
            }
        }
        return registerAdded;
    }

    @Override
    public RegisterDto getAllUsers(int id) {
        if (id>0){
            return dao.getUserById(id);
        }
        return null;
    }
}
