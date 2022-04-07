package com.javaacademy.javaspringrecap.Services;

import com.javaacademy.javaspringrecap.Model.Card;
import com.javaacademy.javaspringrecap.Model.Client;
import com.javaacademy.javaspringrecap.Repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<Card> getAllCardsByClientId(Integer clientId) {
        Client c = clientRepository.getById(clientId);
        return c.getCarduri();
    }

    public void createCardByClientId(Integer clientId, Card card) {
        Client c = clientRepository.getById(clientId);
        c.addCard(card);
    }
}
