package com.javaacademy.javaspringrecap.Repositories;

import com.javaacademy.javaspringrecap.Model.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends CrudRepository<Card,Integer> {
}
