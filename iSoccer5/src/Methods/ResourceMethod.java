package Methods;

import Model.Data;
import Print.Message;

public class ResourceMethod {
    protected Data data;
    protected DataMethod dataMethod;
    protected Utility utility;
    protected Message message;

    protected String managerName;

    public ResourceMethod(Data data, DataMethod dataMethod, Utility utility, Message message) {
        this.data = data;
        this.dataMethod = dataMethod;
        this.utility = utility;
        this.message = message;
    }

    public void addingResource(){
        message.showInsertX("manager's name");
        this.managerName = utility.readString();
    }

    public void editResource(){
        message.showInsertX("the new manager's name");
        this.managerName = utility.readString();

    }

    public void removingResource(){}
}
