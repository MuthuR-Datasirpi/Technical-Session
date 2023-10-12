package com.Project.SpringCrud.repository;

import com.Project.SpringCrud.Entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface customerrepo extends JpaRepository<customer,Integer> {

}
