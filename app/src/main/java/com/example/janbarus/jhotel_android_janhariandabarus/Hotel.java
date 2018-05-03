package com.example.janbarus.jhotel_android_janhariandabarus;

public class Hotel {

    private int id;
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    public Hotel(int id, String nama, Lokasi lokasi, int bintang)
    {
        this.id = id;
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
    }
}

