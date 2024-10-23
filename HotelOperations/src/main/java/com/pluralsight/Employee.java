package com.pluralsight;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    private double punchInTime;
    private double punchOutTime;

    Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void punchIn(double time) {
        this.punchInTime = time;
        System.out.println(name = "punched in at: " + time);
    }

    public void punchOut(double time) {
        this.punchOutTime = time;
        System.out.println(name + "punched out at " + time);
    }

    public void calculateHoursWorked() {
        if (punchOutTime > punchInTime) {
            this.hoursWorked += (int) (punchOutTime - punchInTime);
            ;
        }
    }

    public double getTotalPay() {
        return (getRegularHours() * getPayRate()) + (getOverTimeHours() * (payRate * 1.5));
    }

    public int getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        }
        return 40;
    }

    public int getOverTimeHours() {
        return hoursWorked - 40;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", payRate=" + payRate +
                ", hoursWorked=" + hoursWorked +
                ", punchInTime=" + punchInTime +
                ", punchOutTime=" + punchOutTime +
                '}';
    }
}