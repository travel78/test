package com.shpyrna.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.shpyrna.entity.Ticker;

import lombok.Cleanup;
import org.springframework.stereotype.Service;

import java.io.*;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;

/**
 * Created by Юра on 14.07.2017.
 */
@Service
public class GetTickerService {


    public Ticker getTicker(String url, String currencyPair) throws IOException {

        return getTickers(url).get(currencyPair);
    }

    public Map<String, Ticker> getTickers(String url) throws IOException {
        @Cleanup
        InputStream is = new URL(url).openStream();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
        String jsonText = readAll(rd);
        Type type = new TypeToken<Map<String, Ticker>>() {
        }.getType();
        Map<String, Ticker> tickerMap = new Gson().fromJson(jsonText, type);

        return tickerMap;

    }

    private String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }


}
