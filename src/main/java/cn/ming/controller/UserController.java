package cn.ming.controller;

import cn.ming.mapper.UserMapper;
import cn.ming.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ASUS on 2020/8/13.
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    //查询所有用户  http://localhost:8080/queryUserList
    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        List<User> userList = userMapper.queryUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        return userList;
    }

    //添加一个用户   http://localhost:8080/addUser
    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(4,"小韩","741136"));
        return "addUser is ok";
    }

    //修改一个用户   http://localhost:8080/updateUser
    @GetMapping("/updateUser")
    public String updateUser(){
        userMapper.updateUser(new User(4,"小吴","666666"));
        return "updateUser is ok";
    }

    //根据id删除用户  http://localhost:8080/deleteUser
    @GetMapping("/deleteUser")
    public String deleteUser(){
        userMapper.deleteUser(4);
        return "deleteUser is ok";
    }
}
