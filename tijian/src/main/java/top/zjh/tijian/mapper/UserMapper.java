package top.zjh.tijian.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import top.zjh.tijian.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select("select * from users where userId=#{userId}")
    User login(User user);

    @Insert("insert into users (userId, password, realName, sex, identityCard, birthday, userType) values (#{userId},#{password},#{realName},#{sex},#{identityCard},#{birthday},#{userType})")
    int register(User user);
}