package com.github.nenomm.jpapractice.model.one_to_many.case4;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Child4 {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Parent4 parent;

    private String name;

    public Child4() {
    }

    public Child4(final String p_name) {
        name = p_name;
    }

    public void setParent(Parent4 parent) {
        this.parent = parent;
    }
}
