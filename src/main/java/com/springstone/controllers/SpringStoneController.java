package com.springstone.controllers;

import com.springstone.models.Card;
import com.springstone.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;

@Controller
public class SpringStoneController {
    @Autowired
    private CardService cardService;

    @GetMapping("cards/{name}")
    public ResponseEntity<Card> getCardByName(@PathVariable String name) throws IOException {
        return ResponseEntity.ok(cardService.getCardByName(name));
    }
}
