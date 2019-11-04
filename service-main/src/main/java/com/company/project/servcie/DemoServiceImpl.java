package com.company.project.servcie;

import com.company.project.dao.role.Role;
import com.company.project.dao.role.RoleMapper;
import com.company.project.dao.user.User;
import com.company.project.dao.user.UserMapper;
import com.company.project.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoServiceImpl implements DemoService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

//    @Transactional
    @Override
    public String hello(String name) {
        User user =  new User();
        user.setId(999L);
        user.setName("wangzhj");
        userMapper.insert(user);

        Role role = new Role();
        role.setId(999L);
        role.setRoleName("角色名");
        roleMapper.insert(role);

        return null;
    }
}
