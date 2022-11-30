package com.example.DOANAPP.models;

public class Mypurchase
{
    int purchaseThumb;
    String purchaseName,purchaseStatus,buttonName;


    public Mypurchase(int purchaseThumb, String purchaseName, String purchaseStatus, String buttonName) {
        this.purchaseThumb = purchaseThumb;
        this.purchaseName = purchaseName;
        this.purchaseStatus = purchaseStatus;
        this.buttonName = buttonName;
    }

    public int getPurchaseThumb() {
        return purchaseThumb;
    }

    public void setPurchaseThumb(int purchaseThumb) {
        this.purchaseThumb = purchaseThumb;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }

    public String getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(String purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }
}
