package Methods.ResourceMethodPackage;

import Methods.DataMethod;
import Methods.ResourceMethod;
import Methods.Utility;
import Model.Data;
import Model.ResourcePackage.TrainingCenter;
import Print.Message;

public class TrainingCenterMethod extends ResourceMethod {
    private int nDormitories;
    public TrainingCenterMethod(Data data, DataMethod dataMethod, Utility utility, Message message) {
        super(data, dataMethod, utility, message);
    }

    @Override
    public void addingResource() {
        message.showAddingX("training center");
        super.addingResource();
        boolean done = false;
        while(!done){
            try{
                message.showInsertX("number of dormitories");
                nDormitories = utility.readInteger();
                dataMethod.addingResource(3,new TrainingCenter(managerName,true,nDormitories));
                done = true;
            }catch (NumberFormatException e){
                message.showInvalidInput();
            }
        }
    }

    @Override
    public void editResource() {
        message.showEdittingX("training center");
        if(utility.thereIsSoloResource(data.getTrainingCenter())) {
            System.out.println(data.getTrainingCenter());
            super.editResource();
            try{
                message.showInsertX("the new amount of dormitories");
                nDormitories = utility.readInteger();
                dataMethod.editTrainingCenter(managerName,nDormitories);

            }catch (NumberFormatException e){
                message.showInvalidInput();
                message.showProcessCanceled();
            }
        }else{
            message.showThereIsntX("training center");
        }
    }

    @Override
    public void removingResource() {
        super.removingResource();
        if(utility.thereIsSoloResource(data.getTrainingCenter())){
            message.showAreYouSureMessage("to remove the training center", "1 - CONFIRM");
            try{
                int command = utility.readInteger();
                if(command == 1){
                    utility.removingSoloResource(data.getTrainingCenter());
                    message.showSuccessMessage();
                }else{
                    message.showProcessCanceled();
                }
            }catch(NumberFormatException e){
                message.showInvalidInput();
                message.showProcessCanceled();
            }
        }else{
            message.showThereIsntX("training center");
        }
    }
}
