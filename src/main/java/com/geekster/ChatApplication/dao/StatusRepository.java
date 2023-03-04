package com.geekster.ChatApplication.dao;

import com.geekster.ChatApplication.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}
