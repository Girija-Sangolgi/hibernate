package com.xworkz.userapp.util;

import com.xworkz.userapp.dto.UserDto;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LogInUtil {

    private static SessionFactory factory = null;

    public static SessionFactory getFactory(){
        return factory;
    }
    static {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(UserDto.class);
        factory = configuration.buildSessionFactory();
    }
}
