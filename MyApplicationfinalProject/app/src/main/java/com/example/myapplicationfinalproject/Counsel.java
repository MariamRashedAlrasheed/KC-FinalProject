package com.example.myapplicationfinalproject;

import java.io.Serializable;

public class Counsel implements Serializable {
    private String counselName;
    private String treat;
    private int counselImage;

    public String getCounselName() {
        return counselName;
    }

    public void setCounselName(String counselName) {
        this.counselName = counselName;
    }

    public String getTreat() {
        return treat;
    }

    public void setTreat(String treat) {
        this.treat = treat;
    }

    public int getCounselImage() {
        return counselImage;
    }

    public void setCounselImage(int counselImage) {
        this.counselImage = counselImage;
    }

    public Counsel(String counselName, String treat, int counselImage) {
        this.counselName = counselName;
        this.treat = treat;
        this.counselImage = counselImage;
    }
}
