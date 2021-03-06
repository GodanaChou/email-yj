package edu.cqgcxy.service.impl;

import com.github.pagehelper.PageHelper;
import edu.cqgcxy.mapper.UserMapper;
import edu.cqgcxy.model.User;
import edu.cqgcxy.model.UserExample;
import edu.cqgcxy.service.UserService;
import edu.cqgcxy.util.EncryptUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(User user) throws Exception{
            user.setPassword(new EncryptUtil().md5Digest(user.getPassword()));
            return userMapper.insertSelective(user);
    }

    /**
     * 查询所有用户
     * @param pageNum 分页 第几页
     * @param pageSize 分页 一页显示多少条信息
     * @return 查询结果
     */
    @Override
    public List<User> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        UserExample userExample = new UserExample();
        userExample.createCriteria();
        return userMapper.selectByExample(userExample);
    }

    /**
     * 查询所有用户
     *
     * @return list
     */
    @Override
    public List<User> findAllUser() {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUseridIsNotNull();
        return userMapper.selectByExample(userExample);
    }

    /**
     * 动态语句查询用户
     * @param user 用户属性
     * @return 用户集合
     */
    @Override
    public User findByPhoneAndPSW(User user) throws Exception{
        UserExample userExample = new UserExample();
        String password =new EncryptUtil().md5Digest(user.getPassword());
        userExample.createCriteria().andPhoneEqualTo(user.getPhone()).andPasswordEqualTo(password);
        List<User> u = userMapper.selectByExample(userExample);
        if (!u.isEmpty()){     return u.get(0);    }
       else{    return null;   }
    }

    /**
     * 通过用户ID查询
     *
     * @param id 用户ID
     * @return 用户实体
     */
    @Override
    public User findByPrimaryKey(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 动态语句更新用户属性
     *
     * @param user 用户
     * @return 1更新成功 2更新失败
     */
    @Override
    public int update(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    /**
     * 删除用户
     *
     * @param id 用户ID
     * @return 1删除成功 2删除失败
     */
    @Override
    public int delete(int id) {
         return userMapper.deleteByPrimaryKey(id);
    }

    /**
     * 通过phone查询User
     *
     * @param phone Phone
     * @return User
     */
    @Override
    public User findByPhone(String phone) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPhoneEqualTo(phone);
        List<User> user = userMapper.selectByExample(userExample);
        if(user.size()>=1){
            return user.get(0);
        }else{
            return null;
        }
    }

    /**
     * 查找被举报过多的用户
     *
     * @return list
     */
    @Override
    public List<User> findReport() {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andComplaintCountGreaterThanOrEqualTo(20).andIsvoidEqualTo(0);
        return userMapper.selectByExample(userExample);
    }

    /**
     * 举报后更新举报统计
     *
     * @param user user
     * @return int
     */
    @Override
    public int updataReport(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
