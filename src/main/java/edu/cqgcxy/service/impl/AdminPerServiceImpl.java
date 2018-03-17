package edu.cqgcxy.service.impl;

import edu.cqgcxy.mapper.AdminPermissionsMapper;

import edu.cqgcxy.mapper.PermissionsMapper;
import edu.cqgcxy.model.AdminPermissions;
import edu.cqgcxy.model.AdminPermissionsExample;
import edu.cqgcxy.model.Permissions;
import edu.cqgcxy.model.PermissionsExample;
import edu.cqgcxy.service.AdminPerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adminPerService")
public class AdminPerServiceImpl implements AdminPerService {
    @Autowired
    private AdminPermissionsMapper adminPermissionsMapper;

    @Autowired
    private PermissionsMapper permissionsMapper;

    /**
     * 查找某用户的权限
     *
     * @param id 用户ID
     * @return 权限数组
     */
    @Override
    public List<Permissions> findPerByAdminID(int id) {
        AdminPermissionsExample adminPermissionsExample = new AdminPermissionsExample();
        adminPermissionsExample.createCriteria().andAdminidEqualTo(id);
        return permissionsMapper.selectByAdmPerAdmID(id);
    }

    @Override
    public int addPer(AdminPermissions permissions) {
        return adminPermissionsMapper.insert(permissions);
    }

    @Override
    public AdminPermissions findByIDAndPerID(int id, int perId) {
        AdminPermissionsExample permissionsExample = new AdminPermissionsExample();
        permissionsExample.createCriteria().andAdminidEqualTo(id).andPermissionsIdEqualTo(perId);
        if(adminPermissionsMapper.selectByExample(permissionsExample).size()>=1){
        return adminPermissionsMapper.selectByExample(permissionsExample).get(0);
        }else return null;
    }

    @Override
    public int deletePer(int id) {
        return adminPermissionsMapper.deleteByPrimaryKey(id);
    }
}
