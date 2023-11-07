package com.bitcoin.bitcoinapi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.json.JSONObject;

@Service
public class BitcoinApiService {

    private final RestTemplate restTemplate;

    public BitcoinApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public BitcoinData fetchAndDisplayBitcoinData() {
        String apiUrl = "https://api.coindesk.com/v1/bpi/currentprice.json";
        String jsonResponse = restTemplate.getForObject(apiUrl, String.class);

        try {
            JSONObject json = new JSONObject(jsonResponse);
            JSONObject time = json.getJSONObject("time");
            String updated = time.getString("updated");
            String updatedISO = time.getString("updatedISO");

            JSONObject bpi = json.getJSONObject("bpi");
            JSONObject usd = bpi.getJSONObject("USD");
            String usdRate = usd.getString("rate");
            JSONObject gbp = bpi.getJSONObject("GBP");
            String gbpRate = gbp.getString("rate");
            JSONObject eur = bpi.getJSONObject("EUR");
            String eurRate = eur.getString("rate");

            // Create BitcoinData object
            BitcoinData bitcoinData = new BitcoinData();
            bitcoinData.setUpdated(updated);
            bitcoinData.setUpdatedISO(updatedISO);
            bitcoinData.setUsdRate(usdRate);
            bitcoinData.setGbpRate(gbpRate);
            bitcoinData.setEurRate(eurRate);

            // Display the data
            System.out.println("Raw Bitcoin Data:");
            System.out.println(jsonResponse);
            System.out.println("Updated Time: " + updated);
            System.out.println("Updated ISO: " + updatedISO);
            System.out.println("USD Rate: " + usdRate);
            System.out.println("GBP Rate: " + gbpRate);
            System.out.println("EUR Rate: " + eurRate);

            return bitcoinData;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
