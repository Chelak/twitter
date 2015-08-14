package com.app.twitter.service;

import com.app.twitter.domain.User;

/**
 * Created by user on 8/8/2015.
 */
public interface UserService
{
    public void addUser(User user);
    public User getUserById(Integer id);
    public void editUser(User user);
    public void deleteUser(Integer id);
}
