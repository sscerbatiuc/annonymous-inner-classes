package it.step.lambda.withlambda;

import it.step.lambda.Employee;

@FunctionalInterface
public interface EmployeeValidator {
    public boolean validate(Employee emp);
}
