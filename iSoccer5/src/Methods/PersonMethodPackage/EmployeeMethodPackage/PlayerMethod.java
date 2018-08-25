package Methods.PersonMethodPackage.EmployeeMethodPackage;

import Methods.DataMethod;
import Methods.PersonMethodPackage.EmployeeMethod;
import Methods.Utility;
import Model.Data;
import Model.PersonPackage.EmployeePackage.Player;
import Print.Message;

public class PlayerMethod extends EmployeeMethod {
    public PlayerMethod(Data data, Utility utility, Message message, DataMethod dataMethod) {
        super(data, utility, message, dataMethod);
    }

    public void printPlayers(){
        message.showTitleMenuFULL("Players List");
        for(Player object : data.getPlayers()){
            System.out.println(object);
        }
    }

    private void editingAble(Player player){
        message.showConcludeProcess("change " + player.getName() + "'s capability", "1 - CONFIRM");
        try{
            int command = utility.readInteger();
            if(command == 1){
                if(player.isAble()){
                    boolean done = false;
                    while(!done){
                        try {
                            message.showInsertX("the reason of " + player.getName() + "'s incapability");
                            String nReason = utility.readString();
                            player.setAble(false);
                            player.setReasonInable(nReason);
                            done = true;
                        }catch(NullPointerException e){
                            message.showInvalidInput();
                        }
                    }
                }else{
                    player.setAble(true);
                    player.setReasonInable(null);
                }
                message.showSuccessMessage();
            }else{
                message.showProcessCanceled();
            }

        }catch(NumberFormatException e){
            message.showInvalidInput();
            message.showProcessCanceled();
        }
    }
    public void editAble(){
        if(utility.thereIsArrayPerson(data.getPlayers())){
            this.printPlayers();
            message.showInsertX("player's e-mail");
            String emailPlayer = utility.readString();
            int index = utility.indexOfPerson(emailPlayer, data.getPlayers());
            if(index != -1){
                editingAble(data.getPlayers().get(index));
            }else{
                message.showThereIsntXEmail("player");
                message.showProcessCanceled();
            }
        }else{
            message.showThereIsntX("players");
        }
    }
    @Override
    public void addingPerson() {
        message.showAddingX("player");
        super.addingPerson();
        message.showInsertX("player's position");
        String position = utility.readString();
        dataMethod.addingEmployee(8,new Player(person.getName(),person.getEmail(),person.getCpf(),person.getTelephone(),salary,position));

    }

    @Override
    public void editingPerson() {

        message.showEdittingXNoCurrentInfo("player");
        if(utility.thereIsArrayPerson(data.getPlayers())) {
            message.showInsertX("the player's e-mail");
            String email = utility.readString();
            int index = utility.indexOfPerson(email,data.getPlayers());
            if(index != -1) {
                super.editingPerson();
                message.showInsertX("the new player position");
                String nPosition = utility.readString();
                dataMethod.editPlayer(new Player(person.getName(),person.getEmail(),person.getCpf(),person.getTelephone(),salary,nPosition),index);
            }else{
                message.showThereIsntXEmail("player");
            }
        }else{
            message.showThereIsntX("player");
        }
    }

    @Override
    public void removingPerson() {


        super.removingPerson();
        if(utility.thereIsArrayPerson(data.getPlayers())){
            message.showInsertX("the e-mail of the player you would like to remove");
            String email = utility.readString();
            int index = utility.indexOfPerson(email,data.getPlayers());
            if(index != -1){
                message.showAreYouSureMessage("to remove the player " + data.getPlayers().get(index).getEmail(), "1 - CONFIRM");
                try{
                    int command = utility.readInteger();
                    if(command == 1){
                        data.getPlayers().remove(index);
                        message.showSuccessMessage();
                    }else{
                        message.showProcessCanceled();
                    }
                }catch(NumberFormatException e){
                    message.showInvalidInput();
                    message.showProcessCanceled();
                }
            }else{
                message.showThereIsntXEmail("player");
            }
        }else{
            message.showThereIsntX("players");
            message.showProcessCanceled();
        }
    }
}
