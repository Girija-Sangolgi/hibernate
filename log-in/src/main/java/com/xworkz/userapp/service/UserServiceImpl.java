package com.xworkz.userapp.service;

import com.xworkz.userapp.dao.UserDao;
import com.xworkz.userapp.dao.UserDaoImpl;
import com.xworkz.userapp.dto.UserDto;

public class UserServiceImpl implements UserService{

    UserDao dao = new UserDaoImpl();
    @Override
    public boolean validateUser(UserDto userDto) {

        boolean userNameValid = false;
        boolean phoneNumberValid = false;
        boolean userLogIn = false;
        if (userDto != null) {
            if (userDto.getUserName()!= null && userDto.getPhoneNumber()>0) {
                System.out.println("User name valid");
                userNameValid = true;
            }
            if (userDto.getPhoneNumber()>0 && !userDto.getUserName().isEmpty()) {
                System.out.println("User phonenumber valid");
                userLogIn = true;
            }
            if (userNameValid && phoneNumberValid) {
                userLogIn = dao.saveUser(userDto);
                System.out.println("service info: " +userDto);
            }
        }
        return userLogIn;
    }

    @Override
    public UserDto getUserById(int id) {
        if (id>0){
            return dao.getUserById(id);
        }
        return null;
    }
}
