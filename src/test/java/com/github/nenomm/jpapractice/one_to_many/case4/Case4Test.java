package com.github.nenomm.jpapractice.one_to_many.case4;

import com.github.nenomm.jpapractice.model.one_to_many.case4.Child4;
import com.github.nenomm.jpapractice.model.one_to_many.case4.Parent4;
import com.github.nenomm.jpapractice.repository.case4.Child4Repository;
import com.github.nenomm.jpapractice.repository.case4.Parent4Repository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CountDownLatch;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class Case4Test {

    @Autowired
    private Parent4Repository parent4Repository;

    @Autowired
    private Child4Repository child4Repository;

    public final CountDownLatch latch = new CountDownLatch(1);

    @Test
    public void testPersistence() throws InterruptedException {
        Parent4 parent1 = new Parent4("parent1");
        Child4 child1 = new Child4("child1");   // this gets persisted and has no parent

        parent4Repository.save(parent1);
        child4Repository.save(child1);

        Parent4 parent2 = new Parent4("parent2");
        Child4 child2 = new Child4("child2");   // this gets persisted and has no parent

        parent2.addChild(child2);
        parent4Repository.save(parent2);

        Parent4 parent3 = new Parent4("parent3");
        Child4 child3 = new Child4("child3");

        child3.setParent(parent3);
        parent4Repository.save(parent3);

        Parent4 parent4 = new Parent4("parent4");
        Child4 child4 = new Child4("child4");       // this gets persisted and has parent

        parent4.addChild(child4);
        child4.setParent(parent4);
        parent4Repository.save(parent4);

        Parent4 parent5 = new Parent4("parent5");
        Child4 child5 = new Child4("child5");       // this gets persisted and has parent

        parent5.addChild(child5);
        child5.setParent(parent5);
        parent4Repository.save(parent5);
        child4Repository.save(child5);

        latch.await();
    }

    // no parents are being persisted
    @Test
    public void testPersistByChild() throws InterruptedException {
        Parent4 parent1 = new Parent4("parent1");
        Child4 child1 = new Child4("child1");

        parent1.addChild(child1);
        child4Repository.save(child1);

        Parent4 parent2 = new Parent4("parent2");
        Child4 child2 = new Child4("child2");

        child1.setParent(parent2);
        child4Repository.save(child2);

        latch.await();
    }

}

