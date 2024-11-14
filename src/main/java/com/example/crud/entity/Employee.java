package com.example.crud.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("employeeid") // Set JSON property name for consistency
    private long employeeid;

    @JsonProperty("employeename") // Set JSON property name for consistency
    private String employeename;

    @JsonProperty("employeesalary") // Set JSON property name for consistency
    private float employeesalary;

    public Employee(float employeesalary, String employeename, long employeeid) {
        this.employeesalary = employeesalary;
        this.employeename = employeename;
        this.employeeid = employeeid;
    }

    public Employee() {
    }

    @JsonProperty("employeename") // Consistent JSON name
    public String getEmployeename() {
        return employeename;
    }

    @JsonProperty("employeename")
    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    @JsonProperty("employeeid")
    public long getEmployeeid() {
        return employeeid;
    }

    @JsonProperty("employeeid")
    public void setEmployeeid(long employeeid) {
        this.employeeid = employeeid;
    }

    @JsonProperty("employeesalary")
    public float getEmployeesalary() {
        return employeesalary;
    }

    @JsonProperty("employeesalary")
    public void setEmployeesalary(float employeesalary) {
        this.employeesalary = employeesalary;
    }
}
