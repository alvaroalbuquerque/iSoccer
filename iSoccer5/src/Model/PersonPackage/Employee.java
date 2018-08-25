package Model.PersonPackage;

import Model.Person;

public class Employee extends Person {
    protected double salary;

    public Employee(String name, String email, String cpf, String telephone, double salary) {
        super(name, email, cpf, telephone);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "Salary: $" +
                this.salary + "\n";
    }
}
