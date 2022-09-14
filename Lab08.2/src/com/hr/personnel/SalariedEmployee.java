package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
  private double salary;


  public SalariedEmployee() {
  }

  public SalariedEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  public SalariedEmployee(String name, LocalDate hireDate, double salary) {
    this(name, hireDate);
    setSalary(salary);
  }

  public void pay() {
    System.out.printf("%s is paid a salary of %,.2f%n", getName(), salary);
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
//    return "Employee: name=" + getName() + ", hireDate=" + getHireDate() +" ,salary" + getSalary();
    return String.format("%s, salary=%,.2f", super.toString(), getSalary());// %, puts a comma as a digit separator for numbers > thousands
  }

}
