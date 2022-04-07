package com.javaacademy.javaspringrecap.Model;

import com.javaacademy.javaspringrecap.Exceptions.NotEnoughMoneyException;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cont {
    @Id
    @GeneratedValue
    private Integer id;
    private String iban;
    private Integer sold;
    private AccountType tip;

    @OneToOne
    private Card card;

    public Cont(){
        sold = 0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Integer getSold() {
        return sold;
    }

    public void addMoney(Integer ammount)
    {
        sold += ammount;
    }

    public void withdrawMoney(Integer ammount) throws NotEnoughMoneyException {
        if(ammount <= sold)
            sold -= ammount;
        else throw new NotEnoughMoneyException();
    }

    public AccountType getTip() {
        return tip;
    }

    public void setTip(AccountType tip) {
        this.tip = tip;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
