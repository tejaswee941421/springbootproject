package com.example.SpringMongoProject.Service;

import com.example.SpringMongoProject.Entity.Manager;
import com.example.SpringMongoProject.Repo.ManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServices {

    @Autowired
    private ManagerRepo repo;

    public void saveorUpdate(Manager manager) {

        repo.save(manager);
    }

    public Iterable<Manager> listAll() {

        return this.repo.findAll();
    }


    public void deleteManager(String id) {

        repo.deleteById(id);
    }

    public Manager getManagerByID(String managerid) {

        return repo.findById(managerid).get();
    }
}