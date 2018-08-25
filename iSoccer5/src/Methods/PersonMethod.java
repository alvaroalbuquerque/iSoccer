package Methods;

import Model.Data;
import Model.Person;
import Print.Message;

public class PersonMethod {
    protected Data data;
    protected Utility utility;
    protected Message message;
    protected DataMethod dataMethod;

    protected Person person = new Person(null,null,null,null);

    public PersonMethod(Data data, Utility utility, Message message, DataMethod dataMethod) {
        this.data = data;
        this.utility = utility;
        this.message = message;
        this.dataMethod = dataMethod;
    }

    public void addingPerson(){
        message.showInsertX("name");
        person.setName(utility.readString());
        message.showInsertX("e-mail");
        person.setEmail(utility.readString());
        message.showInsertX("cpf");
        person.setCpf(utility.readString());
        message.showInsertX("telephone");
        person.setTelephone(utility.readString());
    }

    public void editingPerson(){
        message.showInsertX("new name");
        person.setName(utility.readString());
        message.showInsertX("new e-mail");
        person.setEmail(utility.readString());
        message.showInsertX("new cpf");
        person.setCpf(utility.readString());
        message.showInsertX("new telephone");
        person.setTelephone(utility.readString());
    }

    public void removingPerson(){}
}
