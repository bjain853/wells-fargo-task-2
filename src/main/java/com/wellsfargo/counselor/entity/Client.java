package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client{

    @Id
    @GeneratedValue()
    private long clientId;

    @Column(nullable=false)
    private String firstName;

    @Column(nullable=false)
    private String lastName;

    private long advisorId;


    public Client(String firstName,String lastName,long advisorId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.advisorId = advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public long getClientId() {
        return clientId;
    }

    public String getLastName() {
        return lastName;
    }

    public long getAdvisorId() {
        return advisorId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setAdvisorId(long advisorId) {
        this.advisorId = advisorId;
    }


}