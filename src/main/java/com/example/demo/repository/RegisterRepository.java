package com.example.demo.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.RegisterModel;

@Repository
public interface RegisterRepository extends CrudRepository<RegisterModel,String> {

}
