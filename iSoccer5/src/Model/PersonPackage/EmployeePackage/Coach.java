package Model.PersonPackage.EmployeePackage;

import Model.PersonPackage.Employee;

public class Coach extends Employee {
    private int matchesCoached;

    public Coach(String name, String email, String cpf, String telephone, double salary, int matchesCoached) {
        super(name, email, cpf, telephone, salary);
        this.matchesCoached = matchesCoached;
    }

    public int getMatchesCoached() {
        return matchesCoached;
    }

    public void setMatchesCoached(int matchesCoached) {
        this.matchesCoached = matchesCoached;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Matches Coached: " + matchesCoached +
                '\n';
    }
}
