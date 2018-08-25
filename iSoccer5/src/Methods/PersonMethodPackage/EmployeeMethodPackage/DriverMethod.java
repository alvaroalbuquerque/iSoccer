package Methods.PersonMethodPackage.EmployeeMethodPackage;

import Methods.DataMethod;
import Methods.PersonMethodPackage.EmployeeMethod;
import Methods.Utility;
import Model.Data;
import Model.PersonPackage.EmployeePackage.Driver;
import Print.Message;

public class DriverMethod extends EmployeeMethod {
    public DriverMethod(Data data, Utility utility, Message message, DataMethod dataMethod) {
        super(data, utility, message, dataMethod);
    }

    @Override
    public void addingPerson() {
        message.showAddingX("Driver");
        super.addingPerson();
        message.showInsertX("CNH number");
        String cnh = utility.readString();
        dataMethod.addingEmployee(5,new Driver(person.getName(),person.getEmail(),person.getCpf(),person.getTelephone(),salary,cnh));

    }

    @Override
    public void editingPerson() {
        message.showEdittingXNoCurrentInfo("driver");
        if(utility.thereIsArrayPerson(data.getDrivers())) {
            message.showInsertX("the driver's e-mail");
            String email = utility.readString();
            int index = utility.indexOfPerson(email,data.getDrivers());
            if(index != -1) {
                super.editingPerson();
                message.showInsertX("the new CNH number");
                String cnh = utility.readString();
                dataMethod.editDriver(new Driver(person.getName(),person.getEmail(),person.getCpf(),person.getTelephone(),salary,cnh),index);
            }else{
                message.showThereIsntXEmail("driver");
            }
        }else{
            message.showThereIsntX("drivers");
        }
    }

    @Override
    public void removingPerson() {
        super.removingPerson();
        if(utility.thereIsArrayPerson(data.getDrivers())){
            message.showInsertX("the e-mail of the driver you would like to remove");
            String email = utility.readString();
            int index = utility.indexOfPerson(email,data.getDrivers());
            if(index != -1){
                message.showAreYouSureMessage("to remove the driver " + data.getDrivers().get(index).getEmail(), "1 - CONFIRM");
                try{
                    int command = utility.readInteger();
                    if(command == 1){
                        data.getDrivers().remove(index);
                        message.showSuccessMessage();
                    }else{
                        message.showProcessCanceled();
                    }
                }catch(NumberFormatException e){
                    message.showInvalidInput();
                    message.showProcessCanceled();
                }
            }else{
                message.showThereIsntXEmail("driver");
            }
        }else{
            message.showThereIsntX("drivers");
            message.showProcessCanceled();
        }
    }
}
