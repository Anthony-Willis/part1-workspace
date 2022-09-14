package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

  private double rate;
  private double hours;


  public HourlyEmployee() {
  }


  public HourlyEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
    this(name, hireDate);
    setRate(rate);
    setHours(hours);
  }

  public void pay() {
    System.out.printf("%s is paid hourly, for a total of %,.2f%n", getName(), hours*rate);
  }

  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public double getHours() {
    return hours;
  }

  public void setHours(double hours) {
    this.hours = hours;
  }

  @Override
  public String toString() {
//    return super.toString() + ",  rate=" + getRate() + ", hours=" + getHours();
    return String.format("%s, rate=%.2f, hours=%1f", super.toString(), getRate(), getHours());
  } //%.2f means 2 digits after the decimal, formatting a floating point value

  // TODO: 9/13/2022 override ctrl o for toString
}