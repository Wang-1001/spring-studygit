package com.spring.service.Impl;

import com.spring.dao.UserDAO;
import com.spring.entity.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//标注本类是一个service组件
@Service
//启动service层启动事务
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public int insertUser(User user) {
        return userDAO.insert(user);
    }

    @Override
    public int deleteUser(long id) {
        return userDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int updateUser(User user) {
        return userDAO.updateByPrimaryKey(user);
    }

    @Override
    public User getUser(long id) {
        return userDAO.selectByPrimaryKey(id);
    }


    @Override
    public List<User> selectUsers() {

        return userDAO.selectAll();
    }
}
