package com.app.twitter.service;

import com.app.twitter.dao.UserDAO;
import com.app.twitter.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by user on 8/8/2015.
 */
//@Service
//@Transactional(propagation= Propagation.SUPPORTS, readOnly=true)
public class UserServiceImpl implements UserService {


   //@Autowired
    private UserDAO userDAO;
    @Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public void addUser(User user)
    {
        userDAO.addUser(user);
    }

    @Transactional
    public User getUserById(Integer id)
    {
        return userDAO.getUserById(id);
    }

    @Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public void editUser(User user)
    {
        userDAO.editUser(user);
    }

    @Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public void deleteUser(Integer id)
    {
    userDAO.deleteUser(id);
    }
}
