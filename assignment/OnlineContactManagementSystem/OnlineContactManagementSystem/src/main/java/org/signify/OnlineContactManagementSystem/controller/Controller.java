package org.signify.OnlineContactManagementSystem.controller;

import org.signify.OnlineContactManagementSystem.entity.OnlineManagementSystem;
import org.signify.OnlineContactManagementSystem.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private Service onlineContactManagementSystemService;

    @PostMapping("/v1/users")
        public OnlineManagementSystem saveDetails(@RequestBody OnlineManagementSystem onlineContactManagementSystem){
        return onlineContactManagementSystemService.saveDetail(onlineContactManagementSystem);
    }

    @GetMapping("/v1/users/{id}")
    public OnlineManagementSystem getDetailsById(@PathVariable("id") long userId){
        return onlineContactManagementSystemService.getDetailById(userId);

    }

    @PutMapping("/v1/users/{id}")
    public OnlineManagementSystem updateContactDetails(@PathVariable("id") long userId, @RequestBody OnlineManagementSystem onlineContactManagementSystem){
        return onlineContactManagementSystemService.updateContactDetail(userId,onlineContactManagementSystem);
    }

    @DeleteMapping("/v1/users/{id}")
    public void deleteContactDetailsById(@PathVariable("id") long userId){
        onlineContactManagementSystemService.deleteContactDetailById(userId);
    }

}
