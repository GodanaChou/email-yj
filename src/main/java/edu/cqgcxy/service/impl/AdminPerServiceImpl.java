package edu.cqgcxy.service.impl;

import edu.cqgcxy.mapper.AdminPermissionsMapper;

import edu.cqgcxy.mapper.PermissionsMapper;
import edu.cqgcxy.model.AdminPermissionsExample;
import edu.cqgcxy.model.Permissions;
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
}
