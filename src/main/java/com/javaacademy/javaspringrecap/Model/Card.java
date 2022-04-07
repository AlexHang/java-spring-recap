package com.javaacademy.javaspringrecap.Model;

import com.javaacademy.javaspringrecap.Exceptions.IncorrectPINException;

import javax.persistence.*;

@Entity
public class Card {
    @Id
    @GeneratedValue
    private Integer id;
    private String nrCard;
    private String PIN;

    @OneToOne
    private Cont cont;

    @ManyToOne
    private Client client;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNrCard() {
        return nrCard;
    }

    public void setNrCard(String nrCard) {
        this.nrCard = nrCard;
    }

    public Cont getCont() {
        return cont;
    }

    public void setCont(Cont cont) {
        this.cont = cont;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addMoneyToCard(Integer ammount, String PIN) throws IncorrectPINException {
        if(this.validatePIN(PIN)){
            this.cont.addMoney(ammount);
        }else{
            throw new IncorrectPINException();
        }
    }

    public void setPIN(String PIN) {
        if(PIN.length()==4)
            this.PIN = PIN;
        else System.err.println("format gresit");
    }

    public boolean validatePIN(String PIN){
        return PIN.equals(this.PIN);
    }
}
