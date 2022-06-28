package com.webthymeleaf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Column(name = "user")
    private String user;

    @Column(name = "password")
    private String password;

    @Column(name = "displayName")
    private String displayName;

    @Column(name = "address")
    private String address ;
}
