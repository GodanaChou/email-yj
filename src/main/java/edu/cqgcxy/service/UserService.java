package edu.cqgcxy.service;

import edu.cqgcxy.model.User;
import edu.cqgcxy.model.UserExample;

import java.util.List;

public interface UserService {

    /**
     * 添加用户
     * @param user 用户属性
     * @return 1 添加成功 2 添加失败
     * @throws Exception
     */
    int addUser(User user) throws Exception;

    /**
     * 查询所有用户
     * @param pageNum 分页 第几页
     * @param pageSize 分页 一页显示多少条信息
     * @return
     */
    List<User> findAllUser(int pageNum, int pageSize);


    /**
     * 动态语句查询用户
     * @param user 用户属性
     * @return 用户集合
     *@throws Exception
     */
    User findByPhoneAndPSW(User user) throws Exception;

    /**
     * 通过用户ID查询
     * @param id 用户ID
     * @return 用户实体
     */
    User findByPrimaryKey(int id);

    /**
     * 动态语句更新用户属性
     * @param user 用户
     * @return 1更新成功 2更新失败
     */
    int update(User user);

    /**
     * 删除用户
     * @param id 用户ID
     * @return 1删除成功 2删除失败
     */
    int delete(int id);


    /** 通过phone查询User
     * @param phone Phone
     * @return User
     */
    User findByPhone(String phone);
}
