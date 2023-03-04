package com.geekster.ChatApplication.service;

import com.geekster.ChatApplication.dao.StatusRepository;
import com.geekster.ChatApplication.dao.UserRepository;
import com.geekster.ChatApplication.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusService {
    @Autowired
    StatusRepository repository;
    public int saveStatus(Status status) {
        Status statusObj = repository.save(status);
        return statusObj.getStatusId();
    }
}
