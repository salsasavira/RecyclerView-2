package id.sch.smktelkom_mlg.learn.recyclerview2.model;

import android.graphics.drawable.Drawable;

/**
 * Created by asus on 01-Feb-17.
 */

public class Hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
