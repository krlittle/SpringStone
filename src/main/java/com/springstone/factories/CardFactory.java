package com.springstone.factories;

import com.springstone.mappers.CardMapper;
import com.springstone.models.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CardFactory {

    @Autowired
    private CardMapper cardMapper;

    public Card createCardFromResponse(String str) {
        return cardMapper.map(str);
    }
}
