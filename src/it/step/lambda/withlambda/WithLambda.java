package it.step.lambda.withlambda;

import it.step.lambda.Employee;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class WithLambda {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        for(Integer number: numbers) {
            System.out.println(number);
        }
        Employee emp = new Employee("John", "Smith", 1250.0, LocalDate.of(1993, Month.MARCH, 12));
        Employee emp2 = new Employee("Peter", "Smith", 12500.0, LocalDate.of(1955, Month.MARCH, 12));

        EmployeeValidator empSalaryValidator = (e) -> e.getSalary() > 7000;
        EmployeeValidator under30Validator = (e) -> e.getBirthDate().until(LocalDate.now()).getYears() <= 30;

        System.out.println(empSalaryValidator.validate(emp));
        System.out.println(under30Validator.validate(emp));
        System.out.println(empSalaryValidator.validate(emp2));
        System.out.println(under30Validator.validate(emp2));
    }

// Se folosesc 2 linii mai sus in loc de 2 methods below
//    public boolean isSalaryAboveAverage(Employee emp, Double avg) {
//        return emp.getSalary() > avg;
//    }
//
//    public boolean isUnder30Years(Employee emp) {
//        return emp.getBirthDate().until(LocalDate.now()).getYears() <= 30;
//    }
}
