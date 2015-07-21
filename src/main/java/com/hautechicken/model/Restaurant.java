package com.hautechicken.model;

import javax.persistence.*;

/**
 * Created by davidthacker on 7/21/15.
 */
@Entity(name = "Restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Basic
    public String name;

    @Basic
    public String address;

    @Basic
    public String phone;

}
