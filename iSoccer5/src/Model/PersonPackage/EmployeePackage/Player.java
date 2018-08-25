package Model.PersonPackage.EmployeePackage;

import Model.PersonPackage.Employee;

public class Player extends Employee {
    private boolean able;
    private String positionPlayer;
    private String reasonInable;

    public Player(String name, String email, String cpf, String telephone, double salary, String positionPlayer) {

        super(name, email, cpf, telephone, salary);
        this.positionPlayer = positionPlayer;
        this.able = true;
        this.reasonInable = null;
    }

    public boolean isAble() {
        return able;
    }

    public void setAble(boolean able) {
        this.able = able;
    }

    public String getPositionPlayer() {
        return positionPlayer;
    }

    public void setPositionPlayer(String positionPlayer) {
        this.positionPlayer = positionPlayer;
    }

    public String getReasonInable() {
        return reasonInable;
    }

    public void setReasonInable(String reasonInable) {
        this.reasonInable = reasonInable;
    }

    public String ableToString(){
        if(this.able){
            return "Able";
        }else{
            return "Inable (Reason: " + this.reasonInable + ")";
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Player position: " + this.positionPlayer +
                "\nFaculty: " + ableToString() + '\n';
    }
}
