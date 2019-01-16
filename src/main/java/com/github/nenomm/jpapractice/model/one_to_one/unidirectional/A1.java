package com.github.nenomm.jpapractice.model.one_to_one.unidirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class A1 {

    @Id
    @GeneratedValue
    private long id;

    private String name;
}
