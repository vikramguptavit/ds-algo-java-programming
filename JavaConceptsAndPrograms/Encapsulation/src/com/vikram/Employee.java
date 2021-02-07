package com.vikram;

public class Employee {

    public String name;
    public int yearlySalary;
    public int empId;
    public int noOfLeaves = 30;//by default initialize it to 30.

    //no-arg constructor
    public Employee() {

    }

    public void takeLeave(int noOfLeavesToTake){
        if (noOfLeavesToTake <=0 || noOfLeavesToTake >30){
            System.out.println("Invalid no of days...");
            return;
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", yearlySalary=").append(yearlySalary);
        sb.append(", empId=").append(empId);
        sb.append(", noOfLeaves=").append(noOfLeaves);
        sb.append('}');
        return sb.toString();
    }
}
