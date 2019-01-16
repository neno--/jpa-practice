package com.github.nenomm.jpapractice.repository.case4;

import com.github.nenomm.jpapractice.model.one_to_many.case3.Child3;
import com.github.nenomm.jpapractice.model.one_to_many.case4.Child4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Child4Repository extends JpaRepository<Child4, Long> {
}
