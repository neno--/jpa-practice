package com.github.nenomm.jpapractice.model.one_to_one.bidirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class B2 {

    @Id
    @GeneratedValue
    private long id;

    /*@OneToOne
    private A2 a2;*/

    private String name;
}
