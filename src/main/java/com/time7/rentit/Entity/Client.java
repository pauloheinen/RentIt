package com.time7.rentit.Entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Daniel
 */
@Entity(name = "clients")
public class Client
    implements
        Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false, length = 120)
    private String name;
<<<<<<< Updated upstream
    private String phone;
=======
<<<<<<< HEAD
    @Column(name = "email", nullable = false, length = 120)
=======
    private String phone;
>>>>>>> fe754d627f0dbdac6b7abd2e5f4da7edd8490d16
>>>>>>> Stashed changes
    private String email;
    @Column(name = "phone", nullable = false)
    private int phone;
    

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}