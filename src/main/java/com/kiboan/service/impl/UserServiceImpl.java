package com.kiboan.service.impl;

import com.kiboan.dao.UserMapper;
import com.kiboan.model.User;
import com.kiboan.service.UserService;
import com.kiboan.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/10/05.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
