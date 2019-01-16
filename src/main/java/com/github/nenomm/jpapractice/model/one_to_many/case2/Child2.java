package com.github.nenomm.jpapractice.model.one_to_many.case2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Child2 {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Parent2 parent;

    private String name;
}
