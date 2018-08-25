package Methods.ResourceMethodPackage;

import Methods.DataMethod;
import Methods.ResourceMethod;
import Methods.Utility;
import Model.Data;
import Model.ResourcePackage.Bus;
import Print.Message;

public class BusMethod extends ResourceMethod {
    public BusMethod(Data data, DataMethod dataMethod, Utility utility, Message message) {
        super(data, dataMethod, utility, message);
    }

    @Override
    public void addingResource() {
        message.showAddingX("Bus");
        super.addingResource();
        message.showInsertX("the license plate");
        String nPlate = utility.readString();
        dataMethod.addingResource(1,new Bus(managerName,true, nPlate));
    }

    @Override
    public void editResource() {
        message.showInsertX("plate id");
        String busPlate = utility.readString();
        int index = utility.indexOfBus(busPlate,data.getVehicles());
        if(index != -1) {
            super.editResource();
            dataMethod.editBus(managerName, index);
        }else{
            message.showThereIsntBusPlate();
        }
    }

    @Override
    public void removingResource() {
        super.removingResource();
        if(utility.thereIsArrayResource(data.getVehicles())){
            message.showInsertX("the bus' plate id you would like to remove");
            String plate = utility.readString();
            int index = utility.indexOfBus(plate,data.getVehicles());
            if(index != -1){
                message.showAreYouSureMessage("to remove the bus " + data.getVehicles().get(index).getPlate(), "1 - CONFIRM");
                try{
                    int command = utility.readInteger();
                    if(command == 1){
                        data.getVehicles().remove(index);
                        message.showSuccessMessage();
                    }else{
                        message.showProcessCanceled();
                    }
                }catch(NumberFormatException e){
                    message.showInvalidInput();
                    message.showProcessCanceled();
                }
            }else{
                message.showThereIsntBusPlate();
            }
        }else{
            message.showThereIsntX("bus");
        }
    }
}
