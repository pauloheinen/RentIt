package com.time7.rentit.Dto;

import java.io.Serial;
import java.io.Serializable;

/**
 *
 * @author Paulo Henrique
 */
public class EmployeeDto 
    implements
        Serializable {
    
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String userName;
    private String password;
    private int type;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
