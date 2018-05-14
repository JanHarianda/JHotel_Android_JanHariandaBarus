package com.example.janbarus.jhotel_android_janhariandabarus;

public class Lokasi {
    /*
     * Deklarasi variable
     */
    private double x_coord;
    private double y_coord;
    private String deskripsi;

    /**
     * Constructor for objects of class Lokasi
     *
     * @param x_coord koordinat x
     * @param y_coord koordinat y
     * @param deskripsiLokasi penjelasan lokasi
     *
     */
    public Lokasi(double x_coord, double y_coord, String deskripsiLokasi)
    {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsi = deskripsiLokasi;
    }

    /**
     * Mendapatkan nilai x
     *
     * @return x_coord koordinat x
     *
     */
    public double getX()
    {
        return x_coord;
    }

    /**
     * Mendapatkan nilai y
     *
     * @return y_coord koordinat y
     *
     */
    public double getY()
    {
        return y_coord;
    }

    /**
     * Mendapatkan deskripsi lokasi
     *
     * @return deskripsiLokasi penjelasan lokasi
     *
     */
    public String getDeskripsi()
    {
        return deskripsi;
    }

    /**
     * Memberi nilai koordinat x
     *
     * @param x_coord koordinat x
     *
     */
    public void setX(double x_coord)
    {
        this.x_coord =x_coord;
    }

    /**
     * Memberi nilai koordinat y
     *
     * @param y_coord koordinat y
     *
     */
    public void setY(double y_coord)
    {
        this.y_coord = y_coord;
    }

    /**
     * Memberi nilai deskripsi lokasi
     *
     * @param deskripsi penjelasan lokasi
     *
     */

    public void setDeskripsi(String deskripsi)
    {
        this.deskripsi=deskripsi;
    }
}