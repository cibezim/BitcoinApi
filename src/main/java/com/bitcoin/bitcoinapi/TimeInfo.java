package com.bitcoin.bitcoinapi;


import com.fasterxml.jackson.annotation.JsonProperty;

public class TimeInfo {
    private String updated;
    @JsonProperty("updatedISO")
    private String updatedIso;
    private String updateduk;

    // Getters and Setters

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getUpdatedIso() {
        return updatedIso;
    }

    public void setUpdatedIso(String updatedIso) {
        this.updatedIso = updatedIso;
    }

    public String getUpdateduk() {
        return updateduk;
    }

    public void setUpdateduk(String updateduk) {
        this.updateduk = updateduk;
    }
}
