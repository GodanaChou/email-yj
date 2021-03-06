package edu.cqgcxy.service;

import edu.cqgcxy.model.AdminPermissions;
import edu.cqgcxy.model.Permissions;

import java.util.List;

public interface AdminPerService {

    /**查找某用户的权限
     * @param id 用户ID
     * @return 权限数组
     */
    List<Permissions> findPerByAdminID(int id);

    int addPer(AdminPermissions permissions);

    AdminPermissions findByIDAndPerID(int id,int perId);

    int deletePer(int id);
}
