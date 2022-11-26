package com.example.DOANAPP.models;

public class paymethod {
    int paymethodThumb;
    String paymethodName;
    String paymethodSelec;

    public paymethod(int paymethodThumb, String paymethodName, String paymethodSelec) {
        this.paymethodThumb = paymethodThumb;
        this.paymethodName = paymethodName;
        this.paymethodSelec = paymethodSelec;
    }

    public int getPaymethodThumb() {
        return paymethodThumb;
    }

    public void setPaymethodThumb(int paymethodThumb) {
        this.paymethodThumb = paymethodThumb;
    }

    public String getPaymethodName() {
        return paymethodName;
    }

    public void setPaymethodName(String paymethodName) {
        this.paymethodName = paymethodName;
    }

    public String getPaymethodSelec() {
        return paymethodSelec;
    }

    public void setPaymethodSelec(String paymethodSelec) {
        this.paymethodSelec = paymethodSelec;
    }
}
