package com.time7.rentit.Entity;

/**
 *
 * @author Daniel
 */
public class Employee {
    private Long id;
    private String name;
    private String userName;
    private String password;
    private String type;

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName( String userName ) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType( String type ) {
        this.type = type;
    }
}
