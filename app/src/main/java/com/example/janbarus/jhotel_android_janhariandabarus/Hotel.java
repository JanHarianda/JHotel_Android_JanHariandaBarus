package com.example.janbarus.jhotel_android_janhariandabarus;

/**
 * Created by User on 5/3/2018.
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
     * Constructor for objects of class Hotel
     *
     * @param nama nama hotel
     * @param lokasi lokasi hotel
     * @param bintang bintang hotel
     */
    public Hotel(String nama, Lokasi lokasi, int bintang, int id)
    {
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
        this.id = id;
    }

    /**
     * Mendapatkan nilai bintang
     *
     * @return bintang bintang hotel
     *
     */
    public int getBintang()
    {
        return bintang;
    }

    /**
     * Mendapatkan nilai bintang
     *
     * @return id bintang hotel
     *
     */
    public int getID()
    {
        return id;
    }

    /**
     * Mendapatkan nilai nama
     *
     * @return nama nama hotel
     *
     */
    public String getNama()
    {
        return nama;
    }

    /**
     * Mendapatkan nilai lokasi hotel
     *
     * @return lokasi lokasi hotel
     *
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }

    /**
     * Memberi nilai nama hotel
     *
     * @param nama nama hotel
     *
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    /**
     * Memberi nilai lokasi
     *
     * @param id id
     *
     */

    public void setID(int id)
    {
        this.id = id;
    }

    /**
     * Memberi nilai lokasi
     *
     * @param lokasi lokasi hotel
     *
     */

    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }

    /**
     * Memberi nilai bintang
     *
     * @param bintang bintang hotel
     *
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }
}
