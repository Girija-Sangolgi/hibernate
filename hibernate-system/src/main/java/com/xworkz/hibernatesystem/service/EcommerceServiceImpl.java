package com.xworkz.hibernatesystem.service;

import com.xworkz.hibernatesystem.dao.EcommerceDao;
import com.xworkz.hibernatesystem.dao.EcommerceDaoImpl;
import com.xworkz.hibernatesystem.dto.ProductDto;

public class EcommerceServiceImpl implements EcommerceService {

    EcommerceDao dao = new EcommerceDaoImpl();

    @Override
    public boolean validateAndSaveProduct(ProductDto productDto) {
        boolean productNameValid = false;
        boolean productCategoryValid = false;
        boolean productStored = false;
        if (productDto != null) {
            if (productDto.getProductName() != null && !productDto.getProductName().isEmpty()) {
                System.out.println("product name validation");
                productNameValid = true;
            }
            if (productDto.getProductCategory() != null && !productDto.getProductCategory().isEmpty()) {
                System.out.println("product category validation");
                productCategoryValid = true;
            }

            if (productCategoryValid && productNameValid)
                productStored = dao.saveProducts(productDto);
        }
        return productStored;
    }

    @Override
    public ProductDto getProductById(int productId) {
        if (productId>0){
            return dao.getProductById(productId);
        }else System.out.println("Id not found!");
        return null;
    }

    @Override
    public boolean updateProductNameById(String productName,int id) {
        if (id>0 && productName!=null){
            return dao.updateProductNameById(productName,id);
        }
        return true;
    }

    @Override
    public boolean deleteProductById(int id) {
        if (id>0){
            return dao.deleteProductById(id);
        }
        return true;
    }
}


