package com.github.nenomm.jpapractice.model.one_to_many.case3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Child3 {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Parent3 parent;

    private String name;

    public Child3(final String p_name) {
        name = p_name;
    }

    public void setParent(Parent3 parent) {
        this.parent = parent;
    }
}
