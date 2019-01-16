package com.github.nenomm.jpapractice.model.single;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SingleEntity {

    @Id
    @GeneratedValue
    private long id;

    private String name;
}
