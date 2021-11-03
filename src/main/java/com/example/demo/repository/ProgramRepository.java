package com.example.demo.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Program;

@Repository
public interface ProgramRepository extends CrudRepository<Program,BigInteger> {

}
