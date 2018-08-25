package Methods.PersonMethodPackage;

import Methods.DataMethod;
import Methods.PersonMethod;
import Methods.Utility;
import Model.Data;
import Model.PersonPackage.Supporter;
import Print.Message;

import java.util.ArrayList;

public class SupporterMethod extends PersonMethod {
    protected double contributionValue;


    public SupporterMethod(Data data, Utility utility, Message message, DataMethod dataMethod) {
        super(data, utility, message, dataMethod);
    }

    public void printSupporters(){
        message.showTitleMenuFULL("Supporters List");
        for(Supporter object : data.getSupporters()){
            System.out.println(object);
        }
    }

    public void updatingRanking(ArrayList< Supporter> array){
        for(Supporter object : array){
            object.setType(object.typeFromContribution());
        }
    }
    public void editingTopJuniorSenior(){
        message.showInsertX("the top limit for junior ranking");
        boolean done = false;
        while(!done){
            try{
                data.setTopJunior(utility.readDouble());
                done = true;
            }catch (NumberFormatException e){
                message.showInvalidInput();
            }
        }
        done = false;
        while(!done){
            try{
                message.showInsertX("the top limit for senior ranking (It must be bigger than the Junior Limit)");
                double nTopSenior = utility.readDouble();
                if(utility.isBigger(nTopSenior,data.getTopJunior())){
                    data.setTopSenior(nTopSenior);
                    updatingRanking(data.getSupporters());
                    message.showSuccessMessage();
                    done = true;
                }else {
                    message.showInvalidInput();
                }
            }catch(NumberFormatException e){
                message.showInvalidInput();
            }
        }
    }
    public void editingPaid(){
        if(utility.thereIsArrayPerson(data.getSupporters())) {
            message.showInsertX("the supporter's email");
            String emailSupporter = utility.readString();
            int index = utility.indexOfPerson(emailSupporter, data.getSupporters());
            if (index != -1) {
                message.showConcludeProcess("check " + emailSupporter + " as 'Paid'", "1 - CONFIRM");
                try {
                    int command = utility.readInteger();
                    if (command == 1) {
                        data.getSupporters().get(index).setPaid(true);
                        message.showSuccessMessage();
                    } else {
                        message.showProcessCanceled();
                    }
                } catch (NumberFormatException e) {
                    message.showInvalidInput();
                    message.showProcessCanceled();
                }
            } else {
                message.showThereIsntXEmail("supporter");
            }
        }else{
            message.showThereIsntX("supporters");
        }

    }
    private void reseting(){
        for(Supporter object : data.getSupporters()){
            object.setPaid(false);
        }
    }
    public void resetingPaid(){
        message.showAreYouSureMessage("reset every supporter as 'Overdue'",  "1 - CONFIRM");
        try{
            int command = utility.readInteger();
            if(command == 1){
                reseting();
                message.showSuccessMessage();
            }else{
                message.showProcessCanceled();
            }
        }catch (NumberFormatException e){
            message.showInvalidInput();
            message.showProcessCanceled();
        }
    }
    @Override
    public void addingPerson() {
        super.addingPerson();
        boolean done = false;
        while(!done){
            try{
                message.showInsertX("contribution value");
                contributionValue = utility.readDouble();
                done = true;
                dataMethod.addingSupporter(new Supporter(person.getName(), person.getEmail(),
                        person.getCpf(), person.getTelephone(), contributionValue, data));

            }catch(NumberFormatException e){
                message.showInvalidInput();
            }
        }
    }

    @Override
    public void editingPerson() {
            message.showEdittingX("supporter");
            message.showInsertX("the supporter's e-mail");
            String email = utility.readString();
            int index = utility.indexOfPerson(email,data.getSupporters());
            if(index != -1) {
                super.editingPerson();
                message.showInsertX("the new contribution value");
                try{
                    contributionValue = utility.readDouble();
                    dataMethod.editSupporter(new Supporter(person.getName(),person.getEmail(),person.getCpf(),person.getTelephone(),contributionValue, data), index);

                }catch (NumberFormatException e){
                    message.showInvalidInput();
                }
            }else{
                message.showThereIsntXEmail("supporter");
            }
    }

    @Override
    public void removingPerson() {
        super.removingPerson();
        if(utility.thereIsArrayPerson(data.getSupporters())){
            message.showInsertX("the supporter's e-mail you would like to remove");
            String email = utility.readString();
            int index = utility.indexOfPerson(email,data.getSupporters());
            if(index != -1){

                message.showAreYouSureMessage("to remove the supporter " + data.getPlayers().get(index).getEmail(), "1 - CONFIRM");
                try{
                    int command = utility.readInteger();
                    if(command == 1){
                        data.getSupporters().remove(index);
                        message.showSuccessMessage();
                    }else{
                        message.showProcessCanceled();
                    }
                }catch(NumberFormatException e){
                    message.showInvalidInput();
                    message.showProcessCanceled();
                }
            }else{
                message.showThereIsntX("supporter");
            }
        }else{
            message.showThereIsntX("supporter");
        }
    }
}
