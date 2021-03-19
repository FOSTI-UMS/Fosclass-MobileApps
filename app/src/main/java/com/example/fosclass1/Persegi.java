package com.example.fosclass1;

public class Persegi {
    int sisi;
    String warna;

    String hitungLuas(){
        int luas = sisi * sisi;
        return "Persegi ini warnanya "+warna+" Luasnya : "+String.valueOf(luas);
    }

}
