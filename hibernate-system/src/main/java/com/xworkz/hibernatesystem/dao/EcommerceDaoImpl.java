package com.xworkz.hibernatesystem.dao;

import com.xworkz.hibernatesystem.dto.ProductDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class  EcommerceDaoImpl implements EcommerceDao {

    ProductDto product = new ProductDto();

    @Override
    public boolean saveProducts(ProductDto productDto) {

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(ProductDto.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(productDto);
        session.getTransaction().commit();
        sessionFactory.close();
        session.close();
        return true;
    }

    @Override
    public ProductDto getProductById(int productId) {

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(ProductDto.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        ProductDto dto = session.get(ProductDto.class, productId);
        session.close();
        sessionFactory.close();
        return dto;
    }

    @Override
    public boolean updateProductNameById(String productName, int id) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(ProductDto.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        ProductDto dto = session.load(ProductDto.class, id);
        if (dto != null) {
            dto.setProductName(productName);
            session.update(dto);
        } else {
            System.out.println("not found");
        }
        tx.commit();
        System.out.println("Object Updated Successfully....");
        session.close();
        sessionFactory.close();
        return true;
    }

    public boolean deleteProductById(int id) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(ProductDto.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        ProductDto dto = session.get(ProductDto.class, id);
        if (dto != null) {
            session.delete(dto);
        } else {
            System.out.println("not found");
        }
        System.out.println("Object deleted successfully...");
        tx.commit();
        session.close();
        sessionFactory.close();
        return true;
    }
}




