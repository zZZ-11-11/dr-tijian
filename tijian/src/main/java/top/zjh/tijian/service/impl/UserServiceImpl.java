package top.zjh.tijian.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.zjh.tijian.exception.TiJianException;
import top.zjh.tijian.exception.TiJianExceptionEnum;
import top.zjh.tijian.mapper.UserMapper;
import top.zjh.tijian.pojo.User;
import top.zjh.tijian.service.inter.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User login(User user) {
        return userMapper.login(user);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int register(User user) {
        if (userMapper.login(user) != null) {
            throw new TiJianException(TiJianExceptionEnum.USER_REGISTERED.getCode(), TiJianExceptionEnum.USER_REGISTERED.getMsg());
        }
        user.setUserType(1);
        return userMapper.register(user);
    }
}
