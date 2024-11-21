package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Manager;
import com.example.SpringMongoProject.Service.ManagerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/manager")
public class ManagerController {

    @Autowired
    private ManagerServices managerServices;

    @PostMapping(value = "/save")
    private String saveManager(@RequestBody Manager manager) {

        managerServices.saveorUpdate(manager);
        return manager.get_id();
    }

    @GetMapping(value = "/getall")
    public Iterable<Manager> getManager() {
        return managerServices.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    private Manager update(@RequestBody Manager manager, @PathVariable(name = "id") String _id) {
        manager.set_id(_id);
        managerServices.saveorUpdate(manager);
        return manager;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteManager(@PathVariable("id") String _id) {
        managerServices.deleteManager(_id);
    }


    @RequestMapping("/search/{id}")
    private Manager getManager(@PathVariable(name = "id") String managerid) {
        return managerServices.getManagerByID(managerid);
    }

}