package com.javaacademy.javaspringrecap.Controllers;

import com.javaacademy.javaspringrecap.Model.Cont;
import com.javaacademy.javaspringrecap.Services.ContService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cont")
public class ContController {

    @Autowired
    private ContService contService;

    @GetMapping("/id/{id}")
    public Cont getContById(@PathVariable Integer id) {
        return contService.getContById(id);
    }

    @PostMapping("/add_money")
    void addMoney(@RequestBody Integer id, @RequestBody Integer amount){
        contService.addMoney(id, amount);
    }


}
