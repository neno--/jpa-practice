package com.github.nenomm.jpapractice.repository.case3;

import com.github.nenomm.jpapractice.model.one_to_many.case3.Parent3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Parent3Repository extends JpaRepository<Parent3, Long> {
}
