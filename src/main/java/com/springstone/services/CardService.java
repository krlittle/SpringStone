package com.springstone.services;

import com.springstone.factories.CardFactory;
import com.springstone.models.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

@Service
public class CardService {

    @Value("${input.key}")
    private String key;

    @Autowired
    private CardFactory cardFactory;

    public Card getCardByName(String name) throws IOException {

        String encodedName = URLEncoder.encode(name, "UTF-8").replace("+", "%20");

        URL url = new URL("https://omgvamp-hearthstone-v1.p.mashape.com/cards/" + encodedName + "?collectible=1");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("X-Mashape-Key", key);

        String response = httpURLConnection.getResponseMessage();

        String resp = "";

        if (response.equals("OK") && httpURLConnection.getInputStream() !=null) {
            Scanner httpResponseScanner = new Scanner(httpURLConnection.getInputStream());
            while (httpResponseScanner.hasNext()) {
                String line = httpResponseScanner.nextLine();
                resp += line;
                return cardFactory.createCardFromResponse(resp);
            }

            httpResponseScanner.close();
        }

        httpURLConnection.disconnect();
        return null;

    }
}
