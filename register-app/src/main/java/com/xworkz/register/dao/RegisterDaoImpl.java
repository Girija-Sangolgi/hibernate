package com.xworkz.register.dao;

import com.xworkz.register.dto.RegisterDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RegisterDaoImpl implements RegisterDao{
    @Override
    public boolean saveUser(RegisterDto registerDto) {

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(RegisterDto.class);
        SessionFactory factory = configuration.buildSessionFactory();
        Session session =factory.openSession();
        session.beginTransaction();
        session.save(registerDto);
        session.getSessionFactory();
        factory.close();
        session.close();
        return true;
    }

    @Override
    public RegisterDto getUserById(int id) {

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(RegisterDto.class);
        SessionFactory factory = configuration.buildSessionFactory();
        Session session =factory.openSession();
        session.beginTransaction();
        RegisterDto dto = session.get(RegisterDto.class,id);
        factory.close();
        session.close();
        return dto;
    }
}
