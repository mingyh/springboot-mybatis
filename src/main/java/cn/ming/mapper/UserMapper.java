package cn.ming.mapper;

import cn.ming.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ASUS on 2020/8/13.
 */
//  这个注解表示这是个mybatis的Mapper类
@Mapper
@Repository
public interface UserMapper {

    List<User> queryUserList();

    User queryUseById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
