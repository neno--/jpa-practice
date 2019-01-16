package com.github.nenomm.jpapractice.model.one_to_many.case1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Child1 {

    @Id
    @GeneratedValue
    private long id;

    private String name;
}
