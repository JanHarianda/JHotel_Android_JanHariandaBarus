package com.example.janbarus.jhotel_android_janhariandabarus;

/**
 * Created by User on 5/3/2018.
 */

public class Room {
    private String tipeKamar;
    private String roomNumber;
    private double dailyTariff;
    private String statusKamar;

    /**
     * Constructor dari kelas pesanan..
     */

    //input status kamar tidak diperlukan jika statuskamar awal selalu vacant
    public Room(String tipeKamar, String roomNumber, String statusKamar, double dailyTariff )
    {
        this.tipeKamar = tipeKamar;
        this.roomNumber = roomNumber;
        this.statusKamar = statusKamar;
        this.dailyTariff = dailyTariff;
    }

    /**
     * Method yang digunakan untuk mengambil data nomor kamar.
     * @return String mengembalikan data nomor kamar.
     */

    public String getNomorKamar()
    {
        return roomNumber;
    }

    /**
     * Method yang digunakan untuk mengambil data nomor kamar.
     * @return String mengembalikan data nomor kamar.
     */

    public String getTipeKamar()
    {
        return tipeKamar;
    }

    /**
     * Method yang digunakan untuk mengambil data harga kamar.
     * @return double mengembalikan data harga kamar.
     */

    public double getDailyTariff()
    {
        return dailyTariff;
    }

    /**
     * Method yang digunakan untuk mengambil data status kamar.
     * @return StatusKamar mengembalikan data status kamar.
     */

    public String getStatusKamar()
    {
        return statusKamar;
    }

    /**
     * Method yang digunakan untuk mengubah data hotel.
     * @param hotelIn input yang dimasukkan untuk mengubah data hotel.
     */

    public void setTipeKamar(String tipeKamar)
    {
        this.tipeKamar = tipeKamar;
    }

    /**
     * Method yang digunakan untuk mengubah data nomor kamar.
     * @param roomNumber input yang dimasukkan untuk mengubah data nomor kamar.
     */

    public void setNomorKamar(String roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    /**
     * Method yang digunakan untuk mengubah data harga kamar.
     * @param dailyTariff input yang dimasukkan untuk mengubah data harga kamar.
     */

    public void setDailyTariff(double dailyTariff)
    {
        this.dailyTariff = dailyTariff;
    }

    /**
     * Method yang digunakan untuk mengubah data status kamar.
     * @param statusKamar input yang dimasukkan untuk mengubah data status kamar.
     */

    public void setStatusKamar(String statusKamar)
    {
        this.statusKamar = statusKamar;
    }
}