package Methods.PersonMethodPackage.EmployeeMethodPackage;

import Methods.DataMethod;
import Methods.PersonMethodPackage.EmployeeMethod;
import Methods.Utility;
import Model.Data;
import Model.PersonPackage.EmployeePackage.Doctor;
import Print.Message;

public class DoctorMethod extends EmployeeMethod {

    public DoctorMethod(Data data, Utility utility, Message message, DataMethod dataMethod) {
        super(data, utility, message, dataMethod);
    }

    @Override
    public void addingPerson() {
        message.showAddingX("Doctor");
        super.addingPerson();
        message.showInsertX("CRM");
        String crm = utility.readString();
        dataMethod.addingEmployee(2,new Doctor(person.getName(),person.getEmail(),person.getCpf(),person.getTelephone(),salary,crm));
    }

    @Override
    public void editingPerson() {

        message.showEdittingX("Doctor");
        if(utility.thereIsSoloEmployee(data.getDoctor())) {
            System.out.println(data.getDoctor());
            super.editingPerson();
            message.showInsertX("the new crm");
            String nCRM = utility.readString();
            dataMethod.editDoctor(new Doctor(person.getName(),person.getEmail(),person.getCpf(),person.getTelephone(),salary,nCRM));

        }else{
            message.showThereIsntX("doctor");
        }
    }

    @Override
    public void removingPerson() {

        super.removingPerson();
        if(utility.thereIsSoloEmployee(data.getDoctor())){
            message.showAreYouSureMessage("to remove the doctor", "1 - CONFIRM");
            try{
                int command = utility.readInteger();
                if(command == 1){
                    utility.removingSoloEmployee(data.getDoctor());
                    message.showSuccessMessage();
                }else{
                    message.showProcessCanceled();
                }
            }catch(NumberFormatException e){
                message.showInvalidInput();
                message.showProcessCanceled();
            }
        }else{
            message.showThereIsntX("doctor");
        }
    }
}
