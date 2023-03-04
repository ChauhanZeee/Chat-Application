package com.geekster.ChatApplication.service;

import com.geekster.ChatApplication.dao.ChatHistoryRepository;
import com.geekster.ChatApplication.model.ChatHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatHistoryService {
    @Autowired
    ChatHistoryRepository chatHistoryRepository;
    public int saveMessage(ChatHistory chat) {
        ChatHistory chatHistory = chatHistoryRepository.save(chat);
        return chatHistory.getChatId();
    }
}
