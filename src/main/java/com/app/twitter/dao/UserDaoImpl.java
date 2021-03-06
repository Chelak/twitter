package com.app.twitter.dao;

import com.app.twitter.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by user on 8/8/2015.
 */
//@Repository
public class UserDaoImpl implements UserDAO
{

    private SessionFactory sessionFactory;



    //@Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session currentSession()
    {
        return sessionFactory.getCurrentSession();
    }


    public void addUser(User user)
    {
        currentSession().save(user);
    }


    public User getUserById(Integer id) {
       return (User) currentSession().get(User.class, id);
    }


    public void editUser(User user)
    {
        currentSession().update(user);
    }


    public void deleteUser(Integer id)
    {
        User userToDelete = getUserById(id);

        if (userToDelete != null)
        {
            currentSession().delete(userToDelete);
        }

    }
}
