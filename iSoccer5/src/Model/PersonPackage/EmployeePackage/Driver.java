package Model.PersonPackage.EmployeePackage;

import Model.PersonPackage.Employee;

public class Driver extends Employee {
    private String cnh;

    public Driver(String name, String email, String cpf, String telephone, double salary, String cnh) {
        super(name, email, cpf, telephone, salary);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return super.toString() +
                "CNH: " + this.cnh + '\n';
    }


}
