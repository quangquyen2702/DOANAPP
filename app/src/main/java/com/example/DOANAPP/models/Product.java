package com.example.DOANAPP.models;

public class Product
{
    int productThumb;
    String productname;
    String productType;
    String productPrice;
    String productSl;

    public Product(int productThumb, String productname, String productType, String productPrice, String productSl)
    {
        this.productThumb = productThumb;
        this.productname = productname;
        this.productType = productType;
        this.productPrice = productPrice;
        this.productSl = productSl;
    }

    public int getProductThumb() {
        return productThumb;
    }

    public void setProductThumb(int productThumb) {
        this.productThumb = productThumb;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductSl() {
        return productSl;
    }

    public void setProductSl(String productSl) {
        this.productSl = productSl;
    }
}