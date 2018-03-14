package edu.cqgcxy.service.impl;

import edu.cqgcxy.mapper.AdminMapper;
import edu.cqgcxy.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;


}
