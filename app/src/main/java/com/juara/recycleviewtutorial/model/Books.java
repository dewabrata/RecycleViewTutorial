package com.juara.recycleviewtutorial.model;

public class Books {

    private String judul;
    private String sinopsis;
    private String short_sinopsis;
    private String publish_date;
    private String image;

    public Books(){
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getShort_sinopsis() {
        return short_sinopsis;
    }

    public void setShort_sinopsis(String short_sinopsis) {
        this.short_sinopsis = short_sinopsis;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }
}
