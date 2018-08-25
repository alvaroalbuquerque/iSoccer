package Model.PersonPackage;

import Model.Data;
import Model.Person;

public class Supporter extends Person {
    protected double contributionValue;
    protected boolean paid;
    private int type;//1 -> junior; 2 -> senior; 3 -> elite;
    Data data;

    public Supporter(String name, String email, String cpf, String telephone, double contributionValue, Data data) {
        super(name, email, cpf, telephone);
        this.contributionValue = contributionValue;
        this.data = data;
        this.paid = false;
        this.type = typeFromContribution();
    }

    public double getContributionValue() {
        return contributionValue;
    }

    public void setContributionValue(double contributionValue) {
        this.contributionValue = contributionValue;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public int typeFromContribution(){
        if(contributionValue < data.getTopJunior()){
            return 1; //junior
        }else if(contributionValue < data.getTopSenior() ){
            return 2; //senior
        }else{
            return 3; //elite
        }
    }

    public String paidToString(){
        if(paid){
            return "Defaulter";
        }else{
            return "Overdue";
        }
    }

    public String rankToString(){
        switch (this.type){
            case 1: return "Junior";
            case 2: return "Senior";
            case 3: return "Elite";
        }
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "Contribution Value: " + this.contributionValue + "\nStatus: " + paidToString() + "\nRank: " + rankToString() + "\n";
    }
}
