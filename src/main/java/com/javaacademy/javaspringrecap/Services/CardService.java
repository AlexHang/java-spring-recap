package com.javaacademy.javaspringrecap.Services;

import com.javaacademy.javaspringrecap.Exceptions.NotEnoughMoneyException;
import com.javaacademy.javaspringrecap.Model.Card;
import com.javaacademy.javaspringrecap.Model.Cont;
import com.javaacademy.javaspringrecap.Repositories.CardRepository;
import com.javaacademy.javaspringrecap.Repositories.ContRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CardService {
    @Autowired
    CardRepository cardRepository;

    public Card getCardById(Integer id) {
        return cardRepository.getById(id);
    }

    public void addCard(Card card) {
        cardRepository.save(card);
    }

    public void withdrawMoney(Integer cardId, String PIN, Integer ammount) throws NotEnoughMoneyException {
        Card card = getCardById(cardId);
        if(card.validatePIN(PIN)){
            card.getCont().withdrawMoney(ammount);
            cardRepository.save(card);
        }
    }


}
