package Methods.PersonMethodPackage.EmployeeMethodPackage;

import Methods.DataMethod;
import Methods.PersonMethodPackage.EmployeeMethod;
import Methods.Utility;
import Model.Data;
import Model.PersonPackage.EmployeePackage.Lawyer;
import Print.Message;

public class LawyerMethod extends EmployeeMethod {
    public LawyerMethod(Data data, Utility utility, Message message, DataMethod dataMethod) {
        super(data, utility, message, dataMethod);
    }

    @Override
    public void addingPerson() {
        message.showAddingX("Lawyer");
        super.addingPerson();
        message.showInsertX("OAB number");
        String oab = utility.readString();
        dataMethod.addingEmployee(7,new Lawyer(person.getName(),person.getEmail(),person.getCpf(),person.getTelephone(),salary,oab));
    }

    @Override
    public void editingPerson() {

        message.showEdittingXNoCurrentInfo("lawyer");
        if(utility.thereIsArrayPerson(data.getLawyers())) {
            message.showInsertX("the lawyer's e-mail");
            String email = utility.readString();
            int index = utility.indexOfPerson(email,data.getLawyers());
            if(index != -1) {
                super.editingPerson();
                message.showInsertX("the new OAB id");
                String nOAB = utility.readString();
                dataMethod.editLawyer(new Lawyer(person.getName(),person.getEmail(),person.getCpf(),person.getTelephone(),salary,nOAB),index);
            }else{
                message.showThereIsntXEmail("lawyer");
            }
        }else{
            message.showThereIsntX("lawyers");
        }
    }

    @Override
    public void removingPerson() {

        super.removingPerson();
        if(utility.thereIsArrayPerson(data.getLawyers())){
            message.showInsertX("the e-mail of the lawyer you would like to remove");
            String email = utility.readString();
            int index = utility.indexOfPerson(email,data.getLawyers());
            if(index != -1){
                message.showAreYouSureMessage("to remove the lawyer " + data.getLawyers().get(index).getEmail(), "1 - CONFIRM");
                try{
                    int command = utility.readInteger();
                    if(command == 1){
                        data.getLawyers().remove(index);
                        message.showSuccessMessage();
                    }else{
                        message.showProcessCanceled();
                    }
                }catch(NumberFormatException e){
                    message.showInvalidInput();
                    message.showProcessCanceled();
                }
            }else{
                message.showThereIsntXEmail("lawyer");
            }
        }else{
            message.showThereIsntX("lawyers");
            message.showProcessCanceled();
        }
    }
}
