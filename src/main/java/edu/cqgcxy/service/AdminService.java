package edu.cqgcxy.service;

import edu.cqgcxy.model.Admin;
import edu.cqgcxy.model.PowerModel;

import java.util.List;

public interface AdminService {

    /** 通过手机查找管理员
     * @param phone phone
     * @return 管理员详情
     */
    Admin findByPhone(String phone);

    /** 添加管理员
     * @param admin admin
     * @return int
     */
    int addAdmin(Admin admin);

    /** 修改admin
     * @param admin admin
     * @return int
     */
    int updateByAdmin(Admin admin);

    /** 查找所有管理员
     * @return LIST
     */
    List<Admin> findAll();

    /**通过id查找管理员
     * @param id id
     * @return admin
     */
    Admin findByID(int id);

    /**查找正常运行管理员的权限
     * @return 管理员权限列表
     */
    List<PowerModel> findNotIsVoid();
}
