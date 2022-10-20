package com.example.aplikasimenumakanan13294;

public class Model {
    int image;
    String nama, harga, deskripsi;

    public Model(int image, String nama, String harga, String deskripsi) {
        this.image = image;
        this.nama = nama;
        this.harga = harga;
        this.deskripsi = deskripsi;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
