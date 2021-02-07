package com.vikram;

//Company as mutable class , field values can be modified.
class Company {
    private String companyName;
    private int companySize;

    public Company(String companyName, int companySize) {
        this.companyName = companyName;
        this.companySize = companySize;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCompanySize() {
        return companySize;
    }

    public void setCompanySize(int companySize) {
        this.companySize = companySize;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", companySize=" + companySize +
                '}';
    }
}

/*
Here 'Employee' class is immutable class making it final
so no other class can extend this class and cannot modify
its mutable field values Eg.('company' in this case)(Step 3)
 */
final class Employee {
    private String name;
    private int empId;
    private Company company;

    /*
    all argument constructor so that all object fields can be
    initialized at the time of object creation only. (Step 2)
     */
    public Employee(String name, int empId, Company company) {
        this.name = name;
        this.empId = empId;
        /*
        If we use 'company' reference to assign the value to 'company'
        field of 'Employee' class then using the reference which is passed
        to this constructor , one can change 'companyName' or 'companySize'
        fields of the reference passed to constructor as 'Company' class is
        mutable class. (Step 4)
         */
        //this.company = company; //do not use this as 'company' can be modified
        this.company = new Company(company.getCompanyName(),company.getCompanySize());
        //here new object of 'Company' class is created using value of object passed to constructor
    }


    /*
    only getters so that no one can change object fields using
    setter methods for object fields (Step 1)
     */
    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public Company getCompany() {
        /*
        returning clone object of 'company' field of 'Employee' class so no one can
        modify the fields of 'company' using the reference returned by getCompany().
        (Step 5)
         */
        //return company;//do not use this as using 'company' reference its fields can be modified .

        return new Company(company.getCompanyName(),company.getCompanySize());
    }

}

public class Main {

    public static void main(String[] args) {

        //creating 'Company' object
        Company company = new Company("Medium",50);

        //creating 'Employee' object
        Employee employee = new Employee("Ram",1000,company);

        System.out.println("Employee Object is : "+employee);

    }
}
