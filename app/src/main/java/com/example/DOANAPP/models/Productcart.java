package com.example.DOANAPP.models;

import java.io.Serializable;

public class Productcart
{
    int productThumb;
    String productName;


    public Productcart(int productThumb, String productName) {
        this.productThumb = productThumb;
        this.productName = productName;
    }

    public int getProductThumb() {
        return productThumb;
    }

    public void setProductThumb(int productThumb) {
        this.productThumb = productThumb;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
