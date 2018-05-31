package com.example.janbarus.jhotel_android_janhariandabarus;

/**
 * Created by Jan on 5/3/2018.
 */

public class Lokasi {
    private double x_coord;
    private double y_coord;
    private String deskripsi;

    /**
     * Method ini adalah konstruktor untuk objek dari kelas lokasi
     *
     * @param x_coord sebagai koordinat x
     * @param y_coord sebagai koordinat y
     * @param deskripsi sebagai penjelasan lokasi
     *
     */
    public Lokasi(double x_coord, double y_coord, String deskripsi)
    {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsi = deskripsi;
    }

    /**
     * Method ini adalah accessor untuk mengembalikan nilai koordnnat x
     * @return x_coord mengembalikan nilai koordinat x
     */
    public double getX()
    {
        return x_coord;
    }

    /**
     * Method ini adalah accessor untuk mengembalikan nilai y
     *
     * @return y_coord engembalikan nilai koordinat y
     *
     */
    public double getY()
    {
        return y_coord;
    }

    /**
     * Method ini adalah accessor untuk mengembalikan deskripsi lokasi
     *
     * @return deskripsiLokasi mengembalikan lokasi
     *
     */
    public String getDeskripsi()
    {
        return deskripsi;
    }

    /**
     * Method ini adalah mutator untuk mengembalikan nilai koordinat x
     * @param x_coord memgembalikan nilai koordinat x
     */
    public void setX(double x_coord)
    {
        this.x_coord =x_coord;
    }

    /**
     * Method ini adalah mutator untuk mengembalikan nilai koordinat y
     * @param y_coord emgembalikan nilai koordinat y
     */
    public void setY(double y_coord)
    {
        this.y_coord = y_coord;
    }

    /**
     * Method ini adalah mutator untuk mengembalikan deskripsi lokasi
     *
     * @param deskripsi mengembalikan lokasi hotel
     *
     */

    public void setDeskripsi(String deskripsi)
    {
        this.deskripsi = deskripsi;
    }
}