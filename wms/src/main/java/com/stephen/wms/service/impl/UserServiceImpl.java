package com.stephen.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stephen.wms.entity.User;
import com.stephen.wms.mapper.UserMapper;
import com.stephen.wms.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by ssc on 2023-03-26 11:49 .
 * Description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
