package edu.cqgcxy.service.impl;

import edu.cqgcxy.mapper.UserFriendMapper;
import edu.cqgcxy.model.UserFriend;
import edu.cqgcxy.model.UserFriendExample;
import edu.cqgcxy.service.UserFriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userFriend")
public class UserFriendImpl implements UserFriendService {
    @Autowired
    private UserFriendMapper userFriendMapper;

    /**
     * 查找好友
     *
     * @param userID userID
     * @return 好友列表
     */
    @Override
    public List<UserFriend> findUserFriend(int userID) {
        UserFriendExample userFriendExample = new UserFriendExample();
        userFriendExample.createCriteria().andUseridEqualTo(userID);
        return userFriendMapper.selectByExample(userFriendExample);

    }

    /**
     * 添加好友
     *
     * @param userFriend userID
     * @return int
     */
    @Override
    public int addFriend(UserFriend userFriend) {
        return userFriendMapper.insert(userFriend);
    }

    /**
     * 删除好友
     *
     * @param id id
     * @return int
     */
    @Override
    public int deleteFriend(int id) {
        return userFriendMapper.deleteByPrimaryKey(id);
    }


}
