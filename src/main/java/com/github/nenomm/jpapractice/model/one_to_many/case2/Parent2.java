package com.github.nenomm.jpapractice.model.one_to_many.case2;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Parent2 {

    @Id
    @GeneratedValue
    private long id;

    @OneToMany
    private Set<Child2> children;

    private String name;
}
