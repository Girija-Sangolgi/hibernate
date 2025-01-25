package com.xworkz.userapp.dao;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.util.LogInUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserDaoImpl implements UserDao {

    @Override
    public boolean saveUser(UserDto userDto) {

        Session session = LogInUtil.getFactory().openSession();
        session.beginTransaction();
        session.save(userDto);
        session.getTransaction().commit();
        session.close();
        LogInUtil.getFactory().close();
        return true;
    }

    @Override
    public UserDto getUserById(int id) {

        Session session = LogInUtil.getFactory().openSession();
        session.beginTransaction();
        UserDto dto = session.get(UserDto.class,id);
        session.getTransaction().commit();
        session.close();
        LogInUtil.getFactory().close();
        return dto;
    }
}
