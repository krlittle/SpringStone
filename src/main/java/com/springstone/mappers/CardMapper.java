package com.springstone.mappers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springstone.models.Card;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CardMapper {

    public Card map(String response) {
        ObjectMapper objectMapper = new ObjectMapper();

        Card[] cards = new Card[0];

        try {
            cards = objectMapper.readValue(response, Card[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Card card : cards) {
            return card;
        }

        return null;
    }
}
