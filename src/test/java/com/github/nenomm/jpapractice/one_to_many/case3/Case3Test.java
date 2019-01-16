package com.github.nenomm.jpapractice.one_to_many.case3;

import com.github.nenomm.jpapractice.model.one_to_many.case3.Child3;
import com.github.nenomm.jpapractice.model.one_to_many.case3.Parent3;
import com.github.nenomm.jpapractice.repository.case3.Child3Repository;
import com.github.nenomm.jpapractice.repository.case3.Parent3Repository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CountDownLatch;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class Case3Test {

    @Autowired
    private Parent3Repository parent3Repository;

    @Autowired
    private Child3Repository child3Repository;

    public final CountDownLatch latch = new CountDownLatch(1);

    @Test
    public void testPersistence() throws InterruptedException {
        Parent3 parent1 = new Parent3("parent1");
        Child3 child1 = new Child3("child1");   // this gets persisted and has no parent

        parent3Repository.save(parent1);
        child3Repository.save(child1);

        Parent3 parent2 = new Parent3("parent2");
        Child3 child2 = new Child3("child2");

        parent2.addChild(child2);
        parent3Repository.save(parent2);

        Parent3 parent3 = new Parent3("parent3");
        Child3 child3 = new Child3("child3");

        child3.setParent(parent3);
        parent3Repository.save(parent3);

        Parent3 parent4 = new Parent3("parent4");
        Child3 child4 = new Child3("child4");

        parent4.addChild(child4);
        child4.setParent(parent4);
        parent3Repository.save(parent4);

        Parent3 parent5 = new Parent3("parent5");
        Child3 child5 = new Child3("child5");   // this gets persisted

        parent5.addChild(child5);
        child5.setParent(parent5);
        parent3Repository.save(parent5);
        child3Repository.save(child5);

        latch.await();
    }

    // no parents are being persisted
    @Test
    public void testPersistByChild() throws InterruptedException {
        Parent3 parent1 = new Parent3("parent1");
        Child3 child1 = new Child3("child1");

        parent1.addChild(child1);
        child3Repository.save(child1);

        Parent3 parent2 = new Parent3("parent2");
        Child3 child2 = new Child3("child2");

        child1.setParent(parent2);
        child3Repository.save(child2);

        latch.await();
    }

}

