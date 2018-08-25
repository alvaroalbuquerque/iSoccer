package Methods.PersonMethodPackage.EmployeeMethodPackage;

import Methods.DataMethod;
import Methods.PersonMethodPackage.EmployeeMethod;
import Methods.Utility;
import Model.Data;
import Model.PersonPackage.EmployeePackage.Cooker;
import Print.Message;

public class CookerMethod extends EmployeeMethod {
    public CookerMethod(Data data, Utility utility, Message message, DataMethod dataMethod) {
        super(data, utility, message, dataMethod);
    }

    @Override
    public void addingPerson() {
        message.showAddingX("Cooker");
        super.addingPerson();
        message.showInsertX("the schooling (Ex: Graduate Degree, Technical Course ...)");
        String schooling = utility.readString();
        dataMethod.addingEmployee(6,new Cooker(person.getName(),person.getEmail(),person.getCpf(),person.getTelephone(),salary,schooling));

    }

    @Override
    public void editingPerson() {
        message.showEdittingXNoCurrentInfo("cooker");
        if(utility.thereIsArrayPerson(data.getCookers())) {
            message.showInsertX("the cooker's e-mail");
            String email = utility.readString();
            int index = utility.indexOfPerson(email,data.getCookers());
            if(index != -1) {
                super.editingPerson();
                message.showInsertX("the new schooling info");
                String nSchooling = utility.readString();
                dataMethod.editCooker(new Cooker(person.getName(),person.getEmail(),person.getCpf(),person.getTelephone(),salary,nSchooling),index);
            }else{
                message.showThereIsntXEmail("cooker");
            }
        }else{
            message.showThereIsntX("cookers");
        }
    }

    @Override
    public void removingPerson() {
        super.removingPerson();
        if(utility.thereIsArrayPerson(data.getCookers())){
            message.showInsertX("the e-mail of the cooker you would like to remove");
            String email = utility.readString();
            int index = utility.indexOfPerson(email,data.getCookers());
            if(index != -1){
                message.showAreYouSureMessage("to remove the cooker " + data.getCookers().get(index).getEmail(), "1 - CONFIRM");
                try{
                    int command = utility.readInteger();
                    if(command == 1){
                        data.getCookers().remove(index);
                        message.showSuccessMessage();
                    }else{
                        message.showProcessCanceled();
                    }
                }catch(NumberFormatException e){
                    message.showInvalidInput();
                    message.showProcessCanceled();
                }
            }else{
                message.showThereIsntXEmail("cooker");
            }
        }else{
            message.showThereIsntX("cooker");
            message.showProcessCanceled();
        }
    }
}
