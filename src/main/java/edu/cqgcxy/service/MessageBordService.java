package edu.cqgcxy.service;

import edu.cqgcxy.model.MessageBoard;

import java.util.List;

public interface MessageBordService {

    /**查找所有留言板
     * @return List
     */
    List<MessageBoard> findAll();

    /** 添加留言
     * @param messageBoard messageBoard
     * @return int
     */
    int addMessage(MessageBoard messageBoard);
}
