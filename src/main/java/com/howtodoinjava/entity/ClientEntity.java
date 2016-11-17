package com.howtodoinjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENT")
public class ClientEntity {
     
    @Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;
     
    @Column(name="FIRSTNAME")
    private String firstname;
 
    @Column(name="LASTNAME")
    private String lastname;
     
    @Column(name="TELEPHONE")
    private String telephone;

    @Column(name="NUMBER_OF_VISITS")
    private Integer numberOfVisits;
     
     
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getNumberOfVisits() { return numberOfVisits; }
    public void setNumberOfVisits(Integer number) {this.numberOfVisits = number;}

}