package edu.cqgcxy.service.impl;

import edu.cqgcxy.mapper.PermissionsMapper;
import edu.cqgcxy.model.Permissions;
import edu.cqgcxy.model.PermissionsExample;
import edu.cqgcxy.service.PermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(" permissionsService")
public class PermissionsServiceImpl implements PermissionsService{

    @Autowired
    private PermissionsMapper permissionsMapper;


}
