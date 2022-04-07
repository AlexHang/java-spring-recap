package com.javaacademy.javaspringrecap.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @OneToMany
    private List<Card> carduri;

    public Client(){
        carduri = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCarduri() {
        return carduri;
    }

    public void addCard(Card c){
        carduri.add(c);
    }
}
