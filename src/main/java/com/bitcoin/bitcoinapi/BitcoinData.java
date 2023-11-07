package com.bitcoin.bitcoinapi;

public class BitcoinData {
    private String updated;
    private String updatedISO;
    private String usdRate;
    private String gbpRate;
    private String eurRate;


    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getUpdatedISO() {
        return updatedISO;
    }

    public void setUpdatedISO(String updatedISO) {
        this.updatedISO = updatedISO;
    }

    public String getUsdRate() {
        return usdRate;
    }

    public void setUsdRate(String usdRate) {
        this.usdRate = usdRate;
    }

    public String getGbpRate() {
        return gbpRate;
    }

    public void setGbpRate(String gbpRate) {
        this.gbpRate = gbpRate;
    }

    public String getEurRate() {
        return eurRate;
    }

    public void setEurRate(String eurRate) {
        this.eurRate = eurRate;
    }


}