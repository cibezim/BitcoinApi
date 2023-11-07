package com.bitcoin.bitcoinapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bpi {
    @JsonProperty("USD")
    private CurrencyInfo usd;
    @JsonProperty("GBP")
    private CurrencyInfo gbp;
    @JsonProperty("EUR")
    private CurrencyInfo eur;


    public CurrencyInfo getUsd() {
        return usd;
    }

    public void setUsd(CurrencyInfo usd) {
        this.usd = usd;
    }

    public CurrencyInfo getGbp() {
        return gbp;
    }

    public void setGbp(CurrencyInfo gbp) {
        this.gbp = gbp;
    }

    public CurrencyInfo getEur() {
        return eur;
    }

    public void setEur(CurrencyInfo eur) {
        this.eur = eur;
    }
}