package com.github.nenomm.jpapractice.model.one_to_one.bidirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class A2 {

    @Id
    @GeneratedValue
    private long id;

    /*private B2 b2;*/

    private String name;
}
