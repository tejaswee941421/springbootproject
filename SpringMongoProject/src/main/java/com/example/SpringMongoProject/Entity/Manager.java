package com.example.SpringMongoProject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="manager")
public class Manager {

    @Id
    private String _id;
    private String managername;
    private String manageraddress;
    private String mobile;
    private String email;

    public Manager(String _id, String managername, String manageraddress, String mobile, String email) {
        this._id = _id;
        this.managername = managername;
        this.manageraddress = manageraddress;
        this.mobile = mobile;
        this.email = email;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public String getManageraddress() {
        return manageraddress;
    }

    public void setManageraddress(String manageraddress) {
        this.manageraddress = manageraddress;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "_id='" + _id + '\'' +
                ", managername='" + managername + '\'' +
                ", manageraddress='" + manageraddress + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}