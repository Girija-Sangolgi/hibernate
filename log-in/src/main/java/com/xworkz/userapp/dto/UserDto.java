package com.xworkz.userapp.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "login_details")

public class UserDto {

    @Id
    @GenericGenerator(name = "girija",strategy = "increment")
    @GeneratedValue(generator = "girija")

    @Column(name = "id")
    private int id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "phone_number")
    private long phoneNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "confirm_password")
    private String confirmPassword;

}
