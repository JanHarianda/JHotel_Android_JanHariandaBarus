package com.example.janbarus.jhotel_android_janhariandabarus;

/**
 * Created by Jan on 5/3/2018.
 */

public class Hotel {
    /*
     * Deklarasi variable
     */
    private int id;
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    /**
     * Method ini merupakan konstruktor yang meng-assign instance variable
     *
     * @param nama adalah parameter untuk menentukan nama pelanggan
     * @param lokasi adalah parameter untuk menentukan lokasi hotel
     * @param bintang adalah parameter untuk memberikan bintang hotel
     */

    public Hotel(String nama, Lokasi lokasi, int bintang, int id)
    {
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
        this.id = id;
    }

    /**
     * Method ini adalah accessor untuk mengembalikan nilai bintang hotel
     * @return bintang mengembalikan bintang hotel
     *
     */
    public int getBintang()
    {
        return bintang;
    }

    /**
     * Method ini adalah accessor  untuk mengembalikan id hotel
     *
     * @return id mengembalikan id hotel
     *
     */
    public int getID()
    {
        return id;
    }

    /**
     * Method ini adalah accessor untuk mengembalikan nama hotel
     *
     * @return nama mengembalikan nama hotel
     *
     */
    public String getNama()
    {
        return nama;
    }

    /**
     * Method ini adalah accessor untuk mengembalikan lokasi hotel
     *
     * @return lokasi mengembalikan lokasi hotel
     *
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }

    /**
     * Method ini adalah mutator untuk men-set nama hotel
     *
     * @param nama adalah nama hotel
     *
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    /**
     * Method ini adalah mutator untuk men-set id hotel
     *
     * @param id adalah id hotel
     *
     */

    public void setID(int id)
    {
        this.id = id;
    }

    /**
     * Method ini adalah mutator untuk men-set lokasi hotel
     *
     * @param lokasi adalah lokasi hotel
     *
     */

    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }

    /**
     * Method ini adalah mutator untuk men-set bintang hotel
     *
     * @param bintang adalah bintang hotel
     *
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }
}
