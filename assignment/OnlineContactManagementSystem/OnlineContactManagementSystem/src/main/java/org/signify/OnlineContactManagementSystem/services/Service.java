package org.signify.OnlineContactManagementSystem.services;

import org.signify.OnlineContactManagementSystem.entity.OnlineManagementSystem;

public interface Service {


    OnlineManagementSystem getContactDetailById(long userId);

    void deleteContactDetailById(long userId);

    OnlineManagementSystem updateContactDetail(long userId, OnlineManagementSystem onlineContactManagementSystem);

    OnlineManagementSystem saveDetail(OnlineManagementSystem onlineContactManagementSystem);

    OnlineManagementSystem getDetailById(long userId);
}
