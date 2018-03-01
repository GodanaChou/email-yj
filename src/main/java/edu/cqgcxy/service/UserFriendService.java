package edu.cqgcxy.service;

import edu.cqgcxy.model.UserFriend;

import java.util.List;

public interface UserFriendService {

    /**查找好友
     * @param userID userID
     * @return 好友列表
     */
    List<UserFriend> findUserFriend(int userID);

    /** 添加好友
     * @param userFriend userID
     * @return int
     */
    int addFriend(UserFriend userFriend);

    /**删除好友
     * @param id id
     * @return int
     */
    int deleteFriend(int id);
}
