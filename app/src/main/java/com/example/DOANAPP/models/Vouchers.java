package com.example.DOANAPP.models;

public class Vouchers
{
    int imvThumb;
    String txtTitle,txtValid;

    public Vouchers(int imvThumb, String txtTitle, String txtValid) {
        this.imvThumb = imvThumb;
        this.txtTitle = txtTitle;
        this.txtValid = txtValid;
    }

    public int getImvThumb() {
        return imvThumb;
    }

    public void setImvThumb(int imvThumb) {
        this.imvThumb = imvThumb;
    }

    public String getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(String txtTitle) {
        this.txtTitle = txtTitle;
    }

    public String getTxtValid() {
        return txtValid;
    }

    public void setTxtValid(String txtValid) {
        this.txtValid = txtValid;
    }


}

