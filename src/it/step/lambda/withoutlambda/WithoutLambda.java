package it.step.lambda.withoutlambda;

import it.step.lambda.Employee;

import java.time.LocalDate;
import java.time.Month;

public class WithoutLambda {

    public static void main(String[] args) {
        Employee emp = new Employee("John", "Smith", 1250.0, LocalDate.of(1993, Month.MARCH, 12));
        Employee emp2 = new Employee("Peter", "Smith", 12500.0, LocalDate.of(1955, Month.MARCH, 12));

        System.out.println(isSalaryAboveAverage(emp, 7000.0));
        System.out.println(isSalaryAboveAverage(emp2, 600.0));

        System.out.println(isUnder30Years(emp));
        System.out.println(isUnder30Years(emp2));
    }

    public static boolean isSalaryAboveAverage(Employee emp, Double avg) {
        return emp.getSalary() > avg;
    }

    public static boolean isUnder30Years(Employee emp) {
        return emp.getBirthDate().until(LocalDate.now()).getYears() <= 30;
    }
}