package com.time7.rentit.Entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Daniel
 */
@Entity(name = "employees")
public class Employee
    implements
        Serializable {
    
    public static class EMPLOYEES_TYPES {
        public static final int ordinary = 0;
        public static final int admin = 1;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false, length = 120)
    private String name;
    @Column(name = "username", nullable = false, length = 20)
    private String username;
    @Column(name = "password", nullable = false, length = 40)
    private String password;
    @Column(name = "type", nullable = false)
    private int type;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }
    
    public void setType(int type) {
        this.type = type;
    }
}
