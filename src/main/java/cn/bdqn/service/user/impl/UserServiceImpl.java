package cn.bdqn.service.user.impl;

import cn.bdqn.dao.user.UserMapper;
import cn.bdqn.pojo.Easybuy_user;
import cn.bdqn.service.user.UserService;
import org.bouncycastle.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by dll on 2017/8/17.
 */
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public Easybuy_user login(String loginName, String password) throws Exception {
        return userMapper.login(loginName,password);

    }

    @Override
    public void regist(Easybuy_user user) throws Exception {
        userMapper.regist(user);
    }
}
