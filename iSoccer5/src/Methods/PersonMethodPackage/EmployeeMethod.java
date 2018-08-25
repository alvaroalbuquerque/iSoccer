package Methods.PersonMethodPackage;

import Methods.DataMethod;
import Methods.PersonMethod;
import Methods.Utility;
import Model.Data;
import Print.Message;

public class EmployeeMethod extends PersonMethod {
    protected double salary;

    public EmployeeMethod(Data data, Utility utility, Message message, DataMethod dataMethod) {
        super(data, utility, message, dataMethod);
    }

    @Override
    public void addingPerson() {
        super.addingPerson();
        boolean done = false;
        while(!done){
            try{
                message.showInsertX("salary");
                salary = (utility.readDouble());
                done = true;
            }catch (NumberFormatException e){
                message.showInvalidInput();
            }
        }
    }

    @Override
    public void editingPerson() {
        super.editingPerson();
        boolean done = false;
        while(!done){
            try{
                message.showInsertX("new salary");
                salary = (utility.readDouble());
                done = true;
            }catch (NumberFormatException e){
                message.showInvalidInput();
            }
        }

    }

    @Override
    public void removingPerson() {
        super.removingPerson();
    }
}
