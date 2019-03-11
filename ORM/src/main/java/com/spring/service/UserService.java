package com.spring.service;

import com.spring.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 根据id删除用户
     *
     * @param id
     * @return
     */
    int deleteUser(long id);

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    int updateUser(User user);
    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    User getUser(long id);


    /**
     * 查询所有用户
     *
     * @return
     */

    List<User> selectUsers();
}
