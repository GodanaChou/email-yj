package edu.cqgcxy.service.impl;

import edu.cqgcxy.mapper.AdminMapper;
import edu.cqgcxy.model.Admin;
import edu.cqgcxy.model.AdminExample;
import edu.cqgcxy.model.PowerModel;
import edu.cqgcxy.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;


    /**
     * 通过手机查找管理员
     *
     * @param phone phone
     * @return 管理员详情
     */
    @Override
    public Admin findByPhone(String phone) {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andPhoneEqualTo(phone);
        if(!adminMapper.selectByExample(adminExample).isEmpty()){
        return adminMapper.selectByExample(adminExample).get(0);
        }else {
            return null;
        }
    }

    /**
     * 添加管理员
     *
     * @param admin admin
     * @return int
     */
    @Override
    public int addAdmin(Admin admin) {
        return adminMapper.insert(admin);
    }

    /**
     * 修改admin
     *
     * @param admin admin
     * @return int
     */
    @Override
    public int updateByAdmin(Admin admin) {
        return adminMapper.updateByPrimaryKeySelective(admin);
    }

    /**
     * 查找所有管理员
     *
     * @return LIST
     */
    @Override
    public List<Admin> findAll() {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andAdminidIsNotNull();
        return adminMapper.selectByExample(adminExample);
    }

    /**
     * 通过id查找管理员
     *
     * @param id id
     * @return admin
     */
    @Override
    public Admin findByID(int id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    /**
     * 查找正常运行管理员的权限
     *
     * @return 管理员权限列表
     */
    @Override
    public List<PowerModel> findNotIsVoid() {
        return adminMapper.findPowerModel();
    }


}
