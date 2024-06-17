package top.zjh.tijian.service.inter;

import top.zjh.tijian.pojo.User;

public interface UserService {
    User login(User user);

    int register(User user);
}
