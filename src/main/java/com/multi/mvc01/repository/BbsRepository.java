package com.multi.mvc01.repository;

import com.multi.mvc01.entity.BbsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BbsRepository extends JpaRepository<BbsEntity, Integer> {

}
