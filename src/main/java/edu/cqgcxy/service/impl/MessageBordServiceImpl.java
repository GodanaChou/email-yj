package edu.cqgcxy.service.impl;

import edu.cqgcxy.mapper.MessageBoardMapper;
import edu.cqgcxy.model.MessageBoard;
import edu.cqgcxy.model.MessageBoardExample;
import edu.cqgcxy.service.MessageBordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(" messageBordService")
public class MessageBordServiceImpl implements MessageBordService {

    @Autowired
    private MessageBoardMapper messageBoardMapper;


    /**
     * 查找所有留言板
     *
     * @return List
     */
    @Override
    public List<MessageBoard> findAll() {
        MessageBoardExample messageBoardExample = new MessageBoardExample();
        messageBoardExample.createCriteria().andIdIsNotNull();
        return messageBoardMapper.selectByExample(messageBoardExample);
    }

    /**
     * 添加留言
     *
     * @param messageBoard messageBoard
     * @return int
     */
    @Override
    public int addMessage(MessageBoard messageBoard) {
        return messageBoardMapper.insert(messageBoard);
    }
}
