package com.app.mytw.dao;

import com.app.mytw.domain.User;

/**
 * Created by user on 8/8/2015.
 */
public interface UserDAO
{
    public void addUser(User user);
    public User getUserById(Integer id);
    public void editUser(User user);
    public void deleteUser(Integer id);
}
