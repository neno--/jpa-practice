package com.github.nenomm.jpapractice.repository.case3;

import com.github.nenomm.jpapractice.model.one_to_many.case3.Child3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Child3Repository extends JpaRepository<Child3, Long> {
}
