package Methods.PersonMethodPackage.EmployeeMethodPackage;

import Methods.DataMethod;
import Methods.PersonMethodPackage.EmployeeMethod;
import Methods.Utility;
import Model.Data;
import Model.PersonPackage.EmployeePackage.President;
import Print.Message;

public class PresidentMethod extends EmployeeMethod {
    public PresidentMethod(Data data, Utility utility, Message message, DataMethod dataMethod) {
        super(data, utility, message, dataMethod);
    }

    @Override
    public void addingPerson() {
        message.showAddingX("President");
        super.addingPerson();
        boolean done = false;
        while(!done){
            try{
                message.showInsertX("the amount banked");
                double banked = utility.readDouble();
                done = true;
                dataMethod.addingEmployee(1, new President(person.getName(),person.getEmail(),person.getCpf(),person.getTelephone(),salary,banked));

            }catch(NumberFormatException e){
                message.showInvalidInput();
            }
        }
    }

    @Override
    public void editingPerson() {
        message.showEdittingX("President");
        if(utility.thereIsSoloEmployee(data.getPresident())) {
            System.out.println(data.getPresident());
            super.editingPerson();
            try{
                message.showInsertX("the new amount banked");
                double nBanked = utility.readInteger();
                boolean done = true;
                dataMethod.editPresident(new President(person.getName(),person.getEmail(),person.getCpf(),person.getTelephone(),salary,nBanked));

            }catch(NumberFormatException e){
                message.showInvalidInput();
            }
        }else{
            message.showThereIsntX("president");
        }
    }

    @Override
    public void removingPerson() {

        super.removingPerson();
        if(utility.thereIsSoloEmployee(data.getPresident())){
            message.showAreYouSureMessage("to remove the president", "1 - CONFIRM");
            try{
                int command = utility.readInteger();
                if(command == 1){
                    utility.removingSoloEmployee(data.getPresident());
                    message.showSuccessMessage();
                }else{
                    message.showProcessCanceled();
                }
            }catch(NumberFormatException e){
                message.showInvalidInput();
                message.showProcessCanceled();
            }
        }else{
            message.showThereIsntX("president");
        }
    }
}
