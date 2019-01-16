package com.github.nenomm.jpapractice.repository.case4;

import com.github.nenomm.jpapractice.model.one_to_many.case4.Parent4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Parent4Repository extends JpaRepository<Parent4, Long> {
}
