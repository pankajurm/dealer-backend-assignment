package com.pankaj.RequestHandling2.controller;

import com.pankaj.RequestHandling2.dto.ProductDTO;
import com.pankaj.RequestHandling2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(produces = "application/json")
    public List<ProductDTO> fetchProduct() {
        return productService.fetchProduct();
    }

    @PostMapping(produces = "application/json")
    public ResponseEntity<String> CreateProduct(@RequestBody ProductDTO productDTO) {
        String response = productService.CreateProduct(productDTO);
        return ResponseEntity.ok(response);
    }

}
