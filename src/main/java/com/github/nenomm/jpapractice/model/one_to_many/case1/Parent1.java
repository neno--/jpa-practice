package com.github.nenomm.jpapractice.model.one_to_many.case1;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Parent1 {

    @Id
    @GeneratedValue
    private long id;

    @OneToMany
    private Set<Child1> children;

    private String name;
}
