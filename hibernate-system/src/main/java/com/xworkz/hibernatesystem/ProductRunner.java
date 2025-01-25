package com.xworkz.hibernatesystem;

import com.xworkz.hibernatesystem.dto.ProductDto;
import com.xworkz.hibernatesystem.service.EcommerceService;
import com.xworkz.hibernatesystem.service.EcommerceServiceImpl;

public class ProductRunner {

    public static void main(String[] args) {
        System.out.println("main started");

        ProductDto dto = new ProductDto(1,"Saree",
                "Cloths",670.00,4.5);
        ProductDto dto1 = new ProductDto(2,"Earrings",
                "Jewellery",250.00,4.4);
        ProductDto dto2 = new ProductDto(3,"Cetaphil",
                "Cosmetics",699.00,4.7);
        ProductDto dto3 = new ProductDto(4,"Laptop",
                "Device",50000.00,4.6);
        ProductDto dto4 = new ProductDto(5,"Ac",
                "Device",68000.00,4.3);

        EcommerceService service = new EcommerceServiceImpl();
       // service.validateAndSaveProduct(dto);
       // service.validateAndSaveProduct(dto1);
       // service.validateAndSaveProduct(dto2);
       // service.validateAndSaveProduct(dto3);
        //service.validateAndSaveProduct(dto4);
//       ProductDto productdto =service.getProductById(5);
//       System.out.println(productdto);
       // Boolean isUpdated = service.updateProductNameById("Cooler",5);
       // System.out.println(isUpdated);
       Boolean isDeleted = service.deleteProductById(2);
       System.out.println(isDeleted);
        System.out.println("main ended");
    }
}
