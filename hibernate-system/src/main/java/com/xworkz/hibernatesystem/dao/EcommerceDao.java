package com.xworkz.hibernatesystem.dao;

import com.xworkz.hibernatesystem.dto.ProductDto;

public interface EcommerceDao {

    boolean saveProducts(ProductDto productDto);
    ProductDto getProductById(int productId);
    boolean updateProductNameById(String productName,int id);
    boolean deleteProductById(int id);

}
