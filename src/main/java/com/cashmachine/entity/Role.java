package com.cashmachine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {


    private int id;

    private int user_id;

    private String role;

    public Role(int id, int user_id, String role) {
        this.id = id;
        this.user_id = user_id;
        this.role = role;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false, precision = 5, scale = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "id_user")
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Column(name = "Role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
