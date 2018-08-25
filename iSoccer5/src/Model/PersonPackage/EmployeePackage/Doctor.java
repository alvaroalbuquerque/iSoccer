package Model.PersonPackage.EmployeePackage;

import Model.PersonPackage.Employee;

public class Doctor extends Employee {
    private String crm;

    public Doctor(String name, String email, String cpf, String telephone, double salary, String crm) {
        super(name, email, cpf, telephone, salary);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return super.toString() +
                "CRM: " + crm + '\n';
    }
}
