package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name="user",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;
    private String email;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
            name = "userRol",
            joinColumns = @JoinColumn(name = "userId",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "rolId",referencedColumnName = "id")
    )
    private Collection<Rol> rols;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<Rol> getRols() {
        return rols;
    }

    public void setRols(Collection<Rol> rols) {
        this.rols = rols;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(Long id, String lastname, String name, String email, String password, Collection<Rol> rols) {
        this.id = id;
        this.lastname = lastname;
        this.name = name;
        this.email = email;
        this.password = password;
        this.rols = rols;
    }

    public User(String name, String lastname, String email, String password, Collection<Rol> rols) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.rols = rols;
    }

    public User() {
    }
}
