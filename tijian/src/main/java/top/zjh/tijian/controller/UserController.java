package top.zjh.tijian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import top.zjh.tijian.pojo.Result;
import top.zjh.tijian.pojo.User;
import top.zjh.tijian.service.inter.UserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result<User> login(@RequestBody User user) {
        User userReturn = userService.login(user);
        if (userReturn == null)
            return Result.error("该用户未注册");
        if (!userReturn.getPassword().equals(user.getPassword()))
            return Result.error("密码错误");
        return Result.success(userReturn);
    }


    @PostMapping("/register")
    public Result<User> register(@RequestBody User user) {
        int userReturn = userService.register(user);
        if (userReturn == 1)
            return Result.success();
        else
            return Result.error("注册失败");
    }
}
