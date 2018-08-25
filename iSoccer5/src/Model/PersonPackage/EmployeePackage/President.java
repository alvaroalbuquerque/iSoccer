package Model.PersonPackage.EmployeePackage;

import Model.PersonPackage.Employee;

public class President extends Employee {
    private double banked;

    public President(String name, String email, String cpf, String telephone, double salary, double banked) {
        super(name, email, cpf, telephone, salary);
        this.banked = banked;
    }

    public double getBanked() {
        return banked;
    }

    public void setBanked(double banked) {
        this.banked = banked;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Banked: $" + this.banked +
                '\n';
    }
}
