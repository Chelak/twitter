package com.app.twitter.domain;
import javax.persistence.*;
/**
 * Created by user on 8/8/2015.
 */
@Entity
@Table(name="User")
public class User
{
    @Id
    @GeneratedValue
    @Column(name="userId")
    private int id;

    @Column(name="fullName")
    private String fullName;

    @Column(name="userName")
    private String userName;

    @Column(name="password")
    private String password;

    @Column(name="email")
    private String email;

    public User()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
