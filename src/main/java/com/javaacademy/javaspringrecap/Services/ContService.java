package com.javaacademy.javaspringrecap.Services;

import com.javaacademy.javaspringrecap.Exceptions.IncorrectPINException;
import com.javaacademy.javaspringrecap.Exceptions.NotEnoughMoneyException;
import com.javaacademy.javaspringrecap.Model.Card;
import com.javaacademy.javaspringrecap.Model.Cont;
import com.javaacademy.javaspringrecap.Repositories.ContRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*
Java Spring - recapitulare

Vom crea o aplicatie web, care va simula comportamentul unui bancomat.

Fiecare card, are atasat un cont, care poate fi de credit, sau de debit.
Un card are ca informatii : numar de identificare, data expirarii, PIN si un detinator.
Fiecare detinator al cardului, va fi modelat prin clasa client. Un client poate avea unul sau mai multe carduri.

Operatiile care ne intereseaza pentru sistemul nostru, sunt urmatoarele :
- adaugarea de bani intr-un anumit cont.
- retragerea de bani dintr-un anumit cont, pe un anumit card, doar dupa ce am introdus PIN-ul corect (acesta va fi un request parameter)
- interograrea soldului unui anumit card.
- interogarea tutror cardurilor unui anumit client.
- crearea unui nou card pentru un client.

 */
@Service
public class ContService {
    @Autowired
    ContRepository contRepository;

    public Cont getContById(Integer id){
        var contOpt = contRepository.findById(id);
        return contOpt.orElse(null);
    }

    public void addMoney(Integer id, Integer amount) {
        Cont cont = getContById(id);
        cont.addMoney(amount);
    }

    public void withdrawMoney(Integer id, Integer amount) throws NotEnoughMoneyException {
        Cont cont = getContById(id);
        cont.withdrawMoney(amount);
    }

    public Integer checkSold(Integer id) {
        Cont cont = getContById(id);
        return cont.getSold();
    }
}
