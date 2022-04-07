package com.javaacademy.javaspringrecap.Repositories;

import com.javaacademy.javaspringrecap.Model.Cont;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContRepository extends CrudRepository<Cont,Integer> {
}
