package com.github.nenomm.jpapractice.model.one_to_one.unidirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class B1 {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    private B1 b1;

    private String name;
}
