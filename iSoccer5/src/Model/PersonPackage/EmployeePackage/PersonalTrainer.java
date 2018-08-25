package Model.PersonPackage.EmployeePackage;

import Model.PersonPackage.Employee;

public class PersonalTrainer extends Employee {
    private String schooling;

    public PersonalTrainer(String name, String email, String cpf, String telephone, double salary, String schooling) {
        super(name, email, cpf, telephone, salary);
        this.schooling = schooling;
    }

    public String getSchooling() {
        return schooling;
    }

    public void setSchooling(String schooling) {
        this.schooling = schooling;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Schooling: " + this.schooling + '\n';
    }
}
