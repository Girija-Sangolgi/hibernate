package com.xworkz.hibernatesystem.service;

import com.xworkz.hibernatesystem.dto.ProductDto;

public interface EcommerceService {

    boolean validateAndSaveProduct(ProductDto productDto);
    ProductDto getProductById(int productId);
    boolean updateProductNameById(String productName,int id);
    boolean deleteProductById(int id);
}
