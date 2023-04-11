package com.ServiceImpl;

import com.Dao.MessageDao;
import com.Entity.Message;
import com.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageDao messageDao;

    @Override
    public void AddMessage(Message message)
    {
        messageDao.AddMessage(message);
    }
}