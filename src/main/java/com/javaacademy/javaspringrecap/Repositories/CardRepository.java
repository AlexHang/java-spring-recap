package com.javaacademy.javaspringrecap.Repositories;

import com.javaacademy.javaspringrecap.Model.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends CrudRepository<Card,Integer> {
    public Card getById(Integer id);
}
