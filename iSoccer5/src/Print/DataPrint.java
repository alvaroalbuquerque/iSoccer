package Print;

import Methods.Utility;
import Model.Data;
import Model.Person;
import Model.PersonPackage.EmployeePackage.*;
import Model.PersonPackage.Supporter;
import Model.Resource;
import Model.ResourcePackage.Bus;
import java.util.ArrayList;

public class DataPrint {
    Data data;
    Message message;
    Utility utility;

    public DataPrint(Data data, Message message, Utility utility) {
        this.data = data;
        this.message = message;
        this.utility = utility;
    }

    public void reportEmployee(int i){
        message.showTitleMenuEsp("REPORT");
        switch(i){
            case 1: //president
                message.showTitleMenuNoEsp("PRESIDENT");
                if(utility.thereIsSoloEmployee(data.getPresident())){
                    System.out.println(data.getPresident());
                }else{
                    message.showThereIsntX("president");
                }
                break;
            case 2: //doctor
                message.showTitleMenuNoEsp("DOCTOR");
                if(utility.thereIsSoloEmployee(data.getDoctor())){
                    System.out.println(data.getDoctor());
                }else{
                    message.showThereIsntX("doctor");
                }
                break;
            case 3: //coach and players
                message.showTitleMenuNoEsp("COACH");
                if(utility.thereIsSoloEmployee(data.getCoach())){
                    System.out.println(data.getCoach());
                }else{
                    message.showThereIsntX("coach");
                }
                message.showTitleMenuFULL("REPORT PLAYERS");
                if(utility.thereIsArrayPerson(data.getPlayers())){
                    for(Player object : data.getPlayers()){
                        System.out.println(object);
                    }
                }else{
                    message.showThereIsntX("players");
                }
                break;
            case 4: //personal
                message.showTitleMenuNoEsp("PERSONAL TRAINER");
                if(utility.thereIsArrayPerson(data.getPersonalTrainers())){
                    for(PersonalTrainer object : data.getPersonalTrainers()){
                        System.out.println(object);
                    }
                }else{
                    message.showThereIsntX("personal trainers");
                }
                break;
            case 5: //driver
                message.showTitleMenuNoEsp("DRIVER");
                if(utility.thereIsArrayPerson(data.getDrivers())){
                    for (Driver object : data.getDrivers()){
                        System.out.println(object);
                    }
                }else{
                    message.showThereIsntX("drivers");
                }
                break;
            case 6:
                message.showTitleMenuNoEsp("COOKER");
                if(utility.thereIsArrayPerson(data.getCookers())){
                    for(Cooker object : data.getCookers()){
                        System.out.println(object);
                    }
                }else{
                    message.showThereIsntX("cookers");
                }
                break;
            case 7:
                message.showTitleMenuNoEsp("LAWYER");
                if (utility.thereIsArrayPerson(data.getLawyers())) {
                    for(Lawyer object : data.getLawyers()){
                        System.out.println(object);
                    }
                }else{
                    message.showThereIsntX("lawyers");
                }
                break;

        }
    }
    public void reportResource(){
        message.showTitleMenuFULL("REPORT STADIUM");
        if(utility.thereIsSoloResource(data.getStadium())){
            System.out.println(data.getStadium());
        }else{
            message.showThereIsntX("stadium");
            System.out.println();
        }
        message.showTitleMenuFULL("REPORT TRAINING CENTER");
        if(utility.thereIsSoloResource(data.getTrainingCenter())){
            System.out.println(data.getTrainingCenter());
        }else{
            message.showThereIsntX("training center");
            System.out.println();
        }
        message.showTitleMenuFULL("REPORT BUS");
        if(utility.thereIsArrayResource(data.getVehicles())){
            for(Bus object : data.getVehicles()){
                System.out.println(object);
            }
        }else{
            message.showThereIsntX("bus");
        }
    }
    public void reportSupporters(){
        message.showTitleMenuFULL("SUPPORTERS REPORT");
        if(utility.thereIsArrayPerson(data.getSupporters())){
            for(Supporter object : data.getSupporters()){
                System.out.println(object);
            }
        }else{
            message.showThereIsntX("supporters");
        }
    }

    public void checkingAvailabilityResource(){
        message.showTitleMenuFULL("Availability List");
        message.showXAvailable("stadium",utility.thereIsSoloResource(data.getStadium()));
        message.showXAvailable("training center", utility.thereIsSoloResource(data.getTrainingCenter()));
        message.showXAvailable("vehicle", utility.thereIsArrayResource(data.getVehicles()));
    }

    public void printingArrayPerson(ArrayList<? extends Person> array){
                for(Person object : array){
                    System.out.println(object);
                }
    }
    public void printingArrayResource(ArrayList<? extends Resource> array){
        for(Resource object : array){
            System.out.println(object);
        }
    }
}
