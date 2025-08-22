package com.pankaj.RequestHandling2.repository;

import com.pankaj.RequestHandling2.dto.ProductDTO;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepo {

    //List<ProductDTO> products = null;
    List<ProductDTO> products = new ArrayList<>();

    @PostConstruct
    public void initializer() {
        ProductDTO productDTO = new ProductDTO();

        productDTO.setProductCode("101");
        productDTO.setProductName("Hand Blender");
        productDTO.setProductVendor("Philips");
        productDTO.setProductPrice(2050.50);
        productDTO.setProductInStock(20);

        //products = new ArrayList<>();
        products.add(productDTO);

    }


    public void CreateProduct(ProductDTO productDTO) {
        products.add(productDTO);
    }

    public List<ProductDTO> fetchProduct() {
        return products;
    }
}
