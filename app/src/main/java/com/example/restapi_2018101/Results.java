package com.example.restapi_2018101;

import java.io.Serializable;

public class Results implements Serializable {

    private String nomor;

    private String propinsi;

    public String getnomor() {
        return this.nomor;
    }

    public void setnomor(String nomor) {
        this.nomor = nomor;
    }

    public String getpropinsi() {
        return this.propinsi;
    }

    public void setpropinsi(String propinsi) {
        this.propinsi = propinsi;
    }


}
