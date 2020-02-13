package com.juara.recycleviewtutorial.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "mahasiswa")
public class Mahasiswa extends Model {

    @Column(unique = true)
    private String nama;
    @Column
    private String nik;
    @Column
    private String tglLahir;

    public Mahasiswa() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }
}
