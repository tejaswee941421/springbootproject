package com.example.SpringMongoProject.Repo;

import com.example.SpringMongoProject.Entity.Manager;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepo extends MongoRepository<Manager,String> {
}