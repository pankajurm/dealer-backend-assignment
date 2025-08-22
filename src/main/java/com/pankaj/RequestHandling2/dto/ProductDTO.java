package com.pankaj.RequestHandling2.dto;

public class ProductDTO {

    private String productCode;
    private String productName;
    private String productVendor;
    private double productPrice;
    private int productInStock;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    public int getProductInStock() {
        return productInStock;
    }

    public void setProductInStock(int productInStock) {
        this.productInStock = productInStock;
    }

    public ProductDTO(String productCode, String productName, double productPrice, String productVendor, int productInStock) {
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productVendor = productVendor;
        this.productInStock = productInStock;
    }

    public ProductDTO() {
        super();
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", productVendor='" + productVendor + '\'' +
                ", productPrice=" + productPrice +
                ", productInStock=" + productInStock +
                '}';
    }
}
