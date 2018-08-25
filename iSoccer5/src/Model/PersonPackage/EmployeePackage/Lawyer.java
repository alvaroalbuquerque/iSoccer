package Model.PersonPackage.EmployeePackage;

import Model.PersonPackage.Employee;

public class Lawyer extends Employee {
    private String oab;

    public Lawyer(String name, String email, String cpf, String telephone, double salary, String oab) {
        super(name, email, cpf, telephone, salary);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return super.toString() + "OAB id: " + this.oab + "\n";
    }
}
