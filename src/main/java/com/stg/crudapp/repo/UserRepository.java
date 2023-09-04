package com.stg.crudapp.repo;

import com.stg.crudapp.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
@Repository
public interface UserRepository extends JpaRepository<user, BigInteger> {
}
