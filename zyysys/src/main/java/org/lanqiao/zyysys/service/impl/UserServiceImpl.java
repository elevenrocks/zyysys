package org.lanqiao.zyysys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.lanqiao.zyysys.domain.User;
import org.lanqiao.zyysys.service.UserService;
import org.lanqiao.zyysys.dao.UserMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




