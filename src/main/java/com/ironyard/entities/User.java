package com.ironyard.entities;

import javax.persistence.*;

/**
 * Created by jeffryporter on 6/27/16.
 */

@Entity
@Table(name = "users")

public class User
{
    @Id
    @GeneratedValue
    int id;

    @Column(nullable=false)
    String username;

    @Column(nullable=false)
    String email;

    @Column(nullable=false)
    String address;

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
