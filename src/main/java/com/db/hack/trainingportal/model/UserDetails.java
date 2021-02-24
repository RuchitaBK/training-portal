package com.db.hack.trainingportal.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="UserDetails")
public class UserDetails implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotNull
    private String userName;

    public UserDetails() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotNull
    private String password;

    @Email
    private  String email;

    @NotNull
    private boolean isHandicap;

    private String typeDisability;

    private String Severity;


}

