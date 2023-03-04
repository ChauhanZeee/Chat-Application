package com.geekster.ChatApplication.dao;

import com.geekster.ChatApplication.model.ChatHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatHistoryRepository extends JpaRepository<ChatHistory, Integer> {
}
