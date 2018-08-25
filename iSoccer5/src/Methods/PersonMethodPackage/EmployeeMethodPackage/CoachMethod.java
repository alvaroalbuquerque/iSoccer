package Methods.PersonMethodPackage.EmployeeMethodPackage;

import Methods.DataMethod;
import Methods.PersonMethodPackage.EmployeeMethod;
import Methods.Utility;
import Model.Data;
import Model.PersonPackage.EmployeePackage.Coach;
import Print.Message;

public class CoachMethod extends EmployeeMethod {

    public CoachMethod(Data data, Utility utility, Message message, DataMethod dataMethod) {
        super(data, utility, message, dataMethod);
    }

    @Override
    public void addingPerson() {
        message.showAddingX("Coach");
        super.addingPerson();
        boolean done = false;
        while(!done){
            try{
                message.showInsertX("how many matches he/she coached");
                int nMatches = utility.readInteger();
                done = true;
                dataMethod.addingEmployee(3, new Coach(person.getName(),person.getEmail(),person.getCpf(),person.getTelephone(),salary,nMatches));


            }catch(NumberFormatException e){
                message.showInvalidInput();
            }
        }
    }

    @Override
    public void editingPerson() {
        message.showEdittingX("Coach");
        if(utility.thereIsSoloEmployee(data.getCoach())) {
            System.out.println(data.getCoach());
            super.editingPerson();
            try{
                message.showInsertX("the new amount of matches he/she coached");
                int nMatches = utility.readInteger();
                boolean done = true;
                dataMethod.editCoach(new Coach(person.getName(),person.getEmail(),person.getCpf(),person.getTelephone(),salary,nMatches));

            }catch(NumberFormatException e){
                message.showInvalidInput();
            }
        }else{
            message.showThereIsntX("coach");
        }

    }

    @Override
    public void removingPerson() {
        super.removingPerson();
        if(utility.thereIsSoloEmployee(data.getCoach())){
            message.showAreYouSureMessage("to remove the coach", "1 - CONFIRM");
            try{
                int command = utility.readInteger();
                if(command == 1){
                    utility.removingSoloEmployee(data.getCoach());
                    message.showSuccessMessage();
                }else{
                    message.showProcessCanceled();
                }
            }catch(NumberFormatException e){
                message.showInvalidInput();
                message.showProcessCanceled();
            }
        }else{
            message.showThereIsntX("coach");
        }
    }
}
