package com.javaacademy.javaspringrecap.Repositories;

import com.javaacademy.javaspringrecap.Model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client,Integer> {
    public Client getById(Integer id);
}
