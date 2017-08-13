package com.nowcoder.dao;

import com.nowcoder.model.User;
import org.apache.ibatis.annotations.*;

/**
 * Created by chenxueqiang
 */
@Mapper
public interface UserDAO {
    // 注意空格
    String TABLE_NAME = " user ";
    String INSERT_FIELDS = " name, password, salt, head_url ";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    /**
     * 插入用户
     * @param user
     * @return
     */
    @Insert({"insert into ", TABLE_NAME, "(", INSERT_FIELDS,
            ") values (#{name},#{password},#{salt},#{headUrl})"})
    int addUser(User user);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " where id=#{id}"})
    User selectById(int id);

    /**
     * 更新用户密码
     * @param user
     */
    @Update({"update ", TABLE_NAME, " set password=#{password} where id=#{id}"})
    void updatePassword(User user);

    /**
     * 删除用户,真正删除用户时只能执行更新操作，将用户某个标志位更新为0
     * @param id
     */
    @Delete({"delete from ", TABLE_NAME, " where id=#{id}"})
    void deleteById(int id);
}
