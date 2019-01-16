package com.github.nenomm.jpapractice.model.one_to_many.case3;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Parent3 {

    @Id
    @GeneratedValue
    private long id;

    @OneToMany(mappedBy = "parent")
    private Set<Child3> children = new HashSet<>();

    private String name;

    public Parent3(final String p_name) {
        name = p_name;
    }

    public void addChild(Child3 child3) {
        children.add(child3);
    }
}
