package com.app.mytw.service;

import com.app.mytw.dao.UserDAO;
import com.app.mytw.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by user on 8/8/2015.
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDAO userDAO;

    public void addUser(User user)
    {
        userDAO.addUser(user);
    }

    public User getUserById(Integer id)
    {
        return userDAO.getUserById(id);
    }

    public void editUser(User user)
    {
        userDAO.editUser(user);
    }

    public void deleteUser(Integer id)
    {
    userDAO.deleteUser(id);
    }
}
