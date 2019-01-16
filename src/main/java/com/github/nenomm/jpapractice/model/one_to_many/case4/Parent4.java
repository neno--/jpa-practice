package com.github.nenomm.jpapractice.model.one_to_many.case4;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Parent4 {

    @Id
    @GeneratedValue
    private long id;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private Set<Child4> children = new HashSet<>();

    private String name;

    public Parent4() {
    }

    public Parent4(final String p_name) {
        name = p_name;
    }

    public void addChild(Child4 child) {
        children.add(child);
    }
}
