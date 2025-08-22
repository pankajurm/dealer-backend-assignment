package com.pankaj.RequestHandling2.service;

import com.pankaj.RequestHandling2.dto.ProductDTO;
import com.pankaj.RequestHandling2.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public String CreateProduct(ProductDTO productDTO) {
        productRepo.CreateProduct(productDTO);
        return "Product detail: " +productDTO.getProductName() +" added product successfully ";
    }

    public List<ProductDTO> fetchProduct() {
        return productRepo.fetchProduct();
    }


}
