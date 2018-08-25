package Methods.ResourceMethodPackage;

import Methods.DataMethod;
import Methods.ResourceMethod;
import Methods.Utility;
import Model.Data;
import Model.ResourcePackage.Stadium;
import Print.Message;

public class StadiumMethod extends ResourceMethod {
    int nMaxSupporters, nWC, nCafes;

    public StadiumMethod(Data data, DataMethod dataMethod, Utility utility, Message message) {
        super(data, dataMethod, utility, message);
    }

    @Override
    public void addingResource() {
        message.showAddingX("Stadium");
        super.addingResource();
        try{
            message.showInsertX("the maximum number of supporters");
            nMaxSupporters = utility.readInteger();
            message.showInsertX("the number of bathrooms");
            nWC = utility.readInteger();
            message.showInsertX("the number of Cafes");
            nCafes = utility.readInteger();
            dataMethod.addingResource(2,new Stadium(managerName,true,nMaxSupporters,nWC,nCafes));

        }catch (NumberFormatException e){
            message.showInvalidInput();
            message.showProcessCanceled();
        }
    }

    @Override
    public void editResource() {
        message.showEdittingX("stadium");
        if(utility.thereIsSoloResource(data.getStadium())) {
            super.editResource();
            System.out.println(data.getStadium());
            try{
                message.showInsertX("the new maximum number of supporters");
                nMaxSupporters = utility.readInteger();
                message.showInsertX("the new number of bathrooms");
                nWC = utility.readInteger();
                message.showInsertX("the new number of Cafes");
                nCafes = utility.readInteger();
                dataMethod.editStadium(managerName,nMaxSupporters,nWC,nCafes);

            }catch (NumberFormatException e){
                message.showInvalidInput();
                message.showProcessCanceled();
            }
        }else{
            message.showThereIsntX("stadium");
        }
    }

    @Override
    public void removingResource() {
        super.removingResource();

        if(utility.thereIsSoloResource(data.getStadium())){

            message.showAreYouSureMessage("to remove the stadium", "1 - CONFIRM");
            try{
                int command = utility.readInteger();
                if(command == 1){
                    utility.removingSoloResource(data.getStadium());
                    message.showSuccessMessage();
                }else{
                    message.showProcessCanceled();
                }
            }catch(NumberFormatException e){
                message.showInvalidInput();
                message.showProcessCanceled();
            }
        }else{
            message.showThereIsntX("stadium");
        }
    }
}
