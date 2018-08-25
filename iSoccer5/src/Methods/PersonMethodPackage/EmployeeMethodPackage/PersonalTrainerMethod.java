package Methods.PersonMethodPackage.EmployeeMethodPackage;

import Methods.DataMethod;
import Methods.PersonMethodPackage.EmployeeMethod;
import Methods.Utility;
import Model.Data;
import Model.PersonPackage.EmployeePackage.PersonalTrainer;
import Print.Message;

public class PersonalTrainerMethod extends EmployeeMethod {

    public PersonalTrainerMethod(Data data, Utility utility, Message message, DataMethod dataMethod) {
        super(data, utility, message, dataMethod);
    }

    @Override
    public void addingPerson() {
        message.showAddingX("Personal Trainer");
        super.addingPerson();
        message.showInsertX("the schooling(Ex: Graduate Degree, Technical Course ...)");
        String schooling = utility.readString();
        dataMethod.addingEmployee(4, new PersonalTrainer(person.getName(),person.getEmail(),person.getCpf(),person.getTelephone(),salary,schooling));

    }

    @Override
    public void editingPerson() {

        message.showEdittingXNoCurrentInfo("personal trainer");
        if(utility.thereIsArrayPerson(data.getPersonalTrainers())) {
            message.showInsertX("the personal trainer's e-mail");
            String email = utility.readString();
            int index = utility.indexOfPerson(email,data.getPersonalTrainers());
            if(index != -1) {
                super.editingPerson();
                message.showInsertX("the new schooling info");
                String nSchooling = utility.readString();
                dataMethod.editPersonalTrainer(new PersonalTrainer(person.getName(),person.getEmail(),person.getCpf(),person.getTelephone(),salary,nSchooling),index);
            }else{
                message.showThereIsntXEmail("personal trainer");
            }
        }else{
            message.showThereIsntX("personal trainers");
        }
    }

    @Override
    public void removingPerson() {

        super.removingPerson();
        if(utility.thereIsArrayPerson(data.getPersonalTrainers())){
            message.showInsertX("the e-mail of the personal trainer you would like to remove");
            String email = utility.readString();
            int index = utility.indexOfPerson(email,data.getPersonalTrainers());
            if(index != -1){
                message.showAreYouSureMessage("to remove the personal trainer " + data.getPersonalTrainers().get(index).getEmail(), "1 - CONFIRM");
                try{
                    int command = utility.readInteger();
                    if(command == 1){
                        data.getPersonalTrainers().remove(index);
                        message.showSuccessMessage();
                    }else{
                        message.showProcessCanceled();
                    }
                }catch(NumberFormatException e){
                    message.showInvalidInput();
                    message.showProcessCanceled();
                }
            }else{
                message.showThereIsntXEmail("personal trainer");
            }
        }else{
            message.showThereIsntX("personal trainers");
            message.showProcessCanceled();
        }
    }
}
