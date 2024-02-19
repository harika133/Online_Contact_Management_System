package org.signify.OnlineContactManagementSystem.services;

import org.signify.OnlineContactManagementSystem.entity.OnlineManagementSystem;
import org.signify.OnlineContactManagementSystem.repository.OnlineManagementSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;
@org.springframework.stereotype.Service
public class OnlineManagementSystemImplementation implements Service {
    @Autowired
    private OnlineManagementSystemRepository onlineContactManagementSystemRepository;
    @Override
    public OnlineManagementSystem saveDetail(OnlineManagementSystem onlineContactManagementSystem) {
        return onlineContactManagementSystemRepository.save(onlineContactManagementSystem);
    }

    @Override
    public OnlineManagementSystem getDetailById(long userId) {
        return onlineContactManagementSystemRepository.findById(userId).get();
    }

    @Override
    public OnlineManagementSystem getContactDetailById(long userId) {
        return onlineContactManagementSystemRepository.findById(userId).get();
    }

    @Override
    public void deleteContactDetailById(long userId) {
        onlineContactManagementSystemRepository.deleteById(userId);
    }

    @Override
    public OnlineManagementSystem updateContactDetail(long userId, OnlineManagementSystem onlineContactManagementSystem) {
        OnlineManagementSystem contactDB = onlineContactManagementSystemRepository.findById(userId).get();
        if (Objects.nonNull(onlineContactManagementSystem.getName()) && !"".equalsIgnoreCase(onlineContactManagementSystem.getName())) {
            contactDB.setName(onlineContactManagementSystem.getName());
        }
//        if (Objects.nonNull(onlineContactManagementSystem.getPhoneNumber()) && !"".equals(onlineContactManagementSystem.getPhoneNumber())) {
//            contactDB.setPhoneNumber(onlineContactManagementSystem.getPhoneNumber());
//        }
        if (Objects.nonNull(onlineContactManagementSystem.getEmail()) && !"".equalsIgnoreCase(onlineContactManagementSystem.getEmail())) {
            contactDB.setEmail(onlineContactManagementSystem.getEmail());
        }

        return onlineContactManagementSystemRepository.save(contactDB);
    }


}
