package com.time7.rentit.Entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Daniel
 */
@Entity(name = "rents")
public class Rent
    implements
        Serializable {
    
    @Id
    private Long id;
    @Column(name = "name", nullable = false, length = 120)
    private String name;
    @Column(name = "username", nullable = false, length = 20)
    private String username;
    @Column(name = "password", nullable = false, length = 40)
    private String password;
    
}
