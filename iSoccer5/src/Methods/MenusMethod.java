package Methods;

import Running.System;

public class MenusMethod {
    public boolean showMenuSignIn(System system){
        boolean done = false;
        while (!done){
            system.message.showInsertX("login");
            String login = system.utility.readString();
            if(login.equals(system.data.getLogin())){
                system.message.showInsertX("password");
                String password = system.utility.readString();
                if(password.equals(system.data.getPassword())){
                    system.message.showSuccesfullyLogged();
                    return true;
                }else{
                    system.message.showXInvalid("password");
                }
            }else{
                system.message.showXInvalid("login");
            }
        }
        system.message.showProcessCanceled();
        return false;
    }

    public void showMenuRemoveEmployee(System system){
        system.menu.showEmployeeCategory();
        try{
            int command = system.utility.readInteger();
            switch (command){
                case 1:
                    system.presidentMethod.removingPerson();
                    break;
                case 2:
                    system.doctorMethod.removingPerson();
                    break;
                case 3:
                    system.coachMethod.removingPerson();
                    break;
                case 4:
                    if(system.utility.thereIsArrayPerson(system.data.getPersonalTrainers())){
                        system.message.showTitleMenuFULL("Personal Trainers List");
                        system.dataPrint.printingArrayPerson(system.data.getPersonalTrainers());
                        system.personalTrainerMethod.removingPerson();

                    }else{
                        system.message.showThereIsntX("personal trainers");
                    }
                    break;
                case 5:
                    if(system.utility.thereIsArrayPerson(system.data.getDrivers())){
                        system.message.showTitleMenuFULL("Drivers List");
                        system.dataPrint.printingArrayPerson(system.data.getDrivers());
                        system.driverMethod.removingPerson();

                    }else{
                        system.message.showThereIsntX("drivers");
                    }
                    break;
                case 6:
                    if(system.utility.thereIsArrayPerson(system.data.getCookers())){
                        system.message.showTitleMenuFULL("Cookers List");
                        system.dataPrint.printingArrayPerson(system.data.getCookers());
                        system.cookerMethod.removingPerson();

                    }else{
                        system.message.showThereIsntX("cookers");
                    }
                    break;
                case 7:
                    if(system.utility.thereIsArrayPerson(system.data.getLawyers())){
                        system.message.showTitleMenuFULL("Lawyers List");
                        system.dataPrint.printingArrayPerson(system.data.getLawyers());
                        system.lawyerMethod.removingPerson();

                    }else{
                        system.message.showThereIsntX("lawyers");
                    }
                    break;
                case 8:
                    if(system.utility.thereIsArrayPerson(system.data.getPlayers())){
                        system.message.showTitleMenuFULL("Players List");
                        system.dataPrint.printingArrayPerson(system.data.getPlayers());
                        system.playerMethod.removingPerson();

                    }else{
                        system.message.showThereIsntX("players");
                    }
                    break;
                default:
                    system.message.showInvalidInput();
            }

        }catch (NumberFormatException e){
            system.message.showInvalidInput();
        }

    }
    public void showMenuEditEmployee(System system){
        system.menu.showEmployeeCategory();
        try{
            int command = system.utility.readInteger();
            switch (command){
                case 1:
                    system.presidentMethod.editingPerson();
                    break;
                case 2:
                    system.doctorMethod.editingPerson();
                    break;
                case 3:
                    system.coachMethod.editingPerson();
                    break;
                case 4:
                    if(system.utility.thereIsArrayPerson(system.data.getPersonalTrainers())){
                        system.message.showTitleMenuFULL("Personal Trainers List");
                        system.dataPrint.printingArrayPerson(system.data.getPersonalTrainers());
                        system.personalTrainerMethod.editingPerson();

                    }else{
                        system.message.showThereIsntX("personal trainers");
                    }
                    break;
                case 5://drver
                    if(system.utility.thereIsArrayPerson(system.data.getDrivers())){
                        system.message.showTitleMenuFULL("Drivers List");
                        system.dataPrint.printingArrayPerson(system.data.getDrivers());
                        system.driverMethod.editingPerson();

                    }else{
                        system.message.showThereIsntX("drivers");
                    }
                    break;
                case 6:
                    if(system.utility.thereIsArrayPerson(system.data.getCookers())){
                        system.message.showTitleMenuFULL("Cookers List");
                        system.dataPrint.printingArrayPerson(system.data.getCookers());
                        system.cookerMethod.editingPerson();

                    }else{
                        system.message.showThereIsntX("cookers");
                    }
                    break;
                case 7:
                    if(system.utility.thereIsArrayPerson(system.data.getLawyers())){
                        system.message.showTitleMenuFULL("Lawyers List");
                        system.dataPrint.printingArrayPerson(system.data.getLawyers());
                        system.lawyerMethod.editingPerson();

                    }else{
                        system.message.showThereIsntX("lawyers");
                    }
                    break;
                case 8:
                    if(system.utility.thereIsArrayPerson(system.data.getPlayers())){
                        system.message.showTitleMenuFULL("Players List");
                        system.dataPrint.printingArrayPerson(system.data.getPlayers());
                        system.playerMethod.editingPerson();

                    }else{
                        system.message.showThereIsntX("players");
                    }
                    break;
                default:
                    system.message.showInvalidInput();
            }

        }catch (NumberFormatException e){
            system.message.showInvalidInput();
        }
    }
    public void showMenuAddEmployee(System system){
        system.menu.showEmployeeCategory();
        try{
            int command = system.utility.readInteger();
            switch (command){
                case 1:
                    if(!system.utility.thereIsSoloEmployee(system.data.getPresident())) {
                        system.presidentMethod.addingPerson();
                    }else{
                        system.message.showYouCantAddX("president");
                    }
                    break;
                case 2:
                    if(!system.utility.thereIsSoloEmployee(system.data.getDoctor())){
                        system.doctorMethod.addingPerson();
                    }else{
                        system.message.showYouCantAddX("doctor");
                    }
                    break;
                case 3:
                    if(!system.utility.thereIsSoloEmployee(system.data.getCoach())){
                        system.coachMethod.addingPerson();
                    }else{
                        system.message.showYouCantAddX("coach");
                    }
                    break;
                case 4:
                    system.personalTrainerMethod.addingPerson();
                    break;
                case 5:
                    system.driverMethod.addingPerson();
                    break;
                case 6:
                    system.cookerMethod.addingPerson();
                    break;
                case 7:
                    system.lawyerMethod.addingPerson();
                    break;
                case 8:
                    system.playerMethod.addingPerson();
                    break;
                default:
                    system.message.showInvalidInput();
                    break;
            }

        }catch (NumberFormatException e){
            system.message.showInvalidInput();
        }
    }
    public void showMenuReportEmployee(System system){
        system.menu.showEmployeeReportCategory();
        try{
            int command = system.utility.readInteger();
            if(command >= 1 && command <= 7){
                system.dataPrint.reportEmployee(command);
            }else{
                system.message.showInvalidInput();
            }

        }catch (NumberFormatException e){
            system.message.showInvalidInput();
        }
    }
    public void showMenuGeneralEmployee(System system){
        boolean done = false;
        while(!done){
            system.message.showTitleMenuFULL("EMPLOYEE MENU");
            system.menu.showEmployeesMenu();

            try{
                int command = system.utility.readInteger();
                if(command == 1){
                    this.showMenuAddEmployee(system);
                }else if(command == 2){
                    system.playerMethod.editAble();
                }else if(command == 3){
                    this.showMenuReportEmployee(system);
                }else if (command == 4){
                    this.showMenuEditEmployee(system);
                }else if(command == 5){
                    this.showMenuRemoveEmployee(system);
                }else if(command == 0){
                    done = true;
                }else{
                    system.message.showInvalidInput();
                }
            }catch (NumberFormatException e){
                system.message.showInvalidInput();
            }
        }
    }

    public void showMenuGeneralSupporter(System system){
        boolean done = false;
        while(!done){
            system.message.showTitleMenuFULL("SUPPORTER MENU");
            system.menu.showSupporterMenu();
            try{
                int command = system.utility.readInteger();
                if(command == 1){
                    system.supporterMethod.addingPerson();
                }else if (command == 2){
                    system.supporterMethod.editingPaid();
                }else if (command == 3){
                    system.dataPrint.reportSupporters();
                }else if(command == 4){
                    system.supporterMethod.editingTopJuniorSenior();
                }else if (command == 5){
                    system.supporterMethod.resetingPaid();
                }else if (command == 6) {
                    if(system.utility.thereIsArrayPerson(system.data.getSupporters())){
                        system.dataPrint.printingArrayPerson(system.data.getSupporters());
                        system.supporterMethod.editingPerson();
                    }else{
                        system.message.showThereIsntX("supporters");
                    }
                }else if (command == 7) {
                    system.supporterMethod.removingPerson();
                }else if (command == 0){
                    done = true;
                }else{
                    system.message.showInvalidInput();
                }
            }catch (NumberFormatException e){
                system.message.showInvalidInput();
            }
        }
    }

    public void showMenuEditResource(System system){
        system.menu.showResourceCategory();
        try{
            int command = system.utility.readInteger();
            switch (command){
                case 1:
                    system.stadiumMethod.editResource();
                    break;
                case 2:
                    system.trainingCenterMethod.editResource();
                    break;
                case 3:
                    if(system.utility.thereIsArrayResource(system.data.getVehicles())) {
                        system.dataPrint.printingArrayResource(system.data.getVehicles());
                        system.busMethod.editResource();
                    }else{
                        system.message.showThereIsntX("vehicles");
                    }
                    break;
                default:
                    system.message.showInvalidInput();
                    break;
            }
        }catch (NumberFormatException e){
            system.message.showInvalidInput();
        }
    }
    public void showMenuAddResource(System system){
        system.menu.showResourceCategory();
        try{
            int command = system.utility.readInteger();
            switch (command){
                case 1:
                    if(!system.utility.thereIsSoloResource(system.data.getStadium())) {
                        system.stadiumMethod.addingResource();
                    }else{
                        system.message.showYouCantAddX("stadium");
                    }
                    break;
                case 2:
                    if(!system.utility.thereIsSoloResource(system.data.getTrainingCenter())) {
                        system.trainingCenterMethod.addingResource();
                    }else{
                        system.message.showYouCantAddX("training center");
                    }
                    break;
                case 3:
                    system.busMethod.addingResource();
                    break;
                default:
                    system.message.showInvalidInput();
                    break;
            }

        }catch (NumberFormatException e){
            system.message.showInvalidInput();
        }
    }
    public void showMenuRemoveResource(System system){
        system.menu.showResourceCategory();
        try{
            int command = system.utility.readInteger();
            switch (command){
                case 1:
                    system.stadiumMethod.removingResource();
                    break;
                case 2:
                    system.trainingCenterMethod.removingResource();
                    break;
                case 3:
                    if(system.utility.thereIsArrayResource(system.data.getVehicles())) {
                        system.dataPrint.printingArrayResource(system.data.getVehicles());
                        system.busMethod.removingResource();
                    }else{
                        system.message.showThereIsntX("vehicles");
                    }
                    break;
                default:
                    system.message.showInvalidInput();
                    break;
            }

        }catch (NumberFormatException e){
            system.message.showInvalidInput();
        }
    }
    public void showMenuGeneralResource(System system){
        boolean done = false;
        while(!done){
            system.message.showTitleMenuFULL("RESOURCE MENU");
            system.menu.showResourceMenu();
            try{
                int command = system.utility.readInteger();
                switch(command){
                    case 1:
                        this.showMenuAddResource(system);
                        break;
                    case 2:
                        system.dataPrint.checkingAvailabilityResource();
                        break;
                    case 3:
                        system.dataPrint.reportResource();
                        break;
                    case 4:
                        this.showMenuEditResource(system);
                        break;
                    case 5:
                        this.showMenuRemoveResource(system);
                        break;
                    case 0:
                        done = true;
                        break;
                    default:
                        system.message.showInvalidInput();
                }

            }catch(NumberFormatException e){
                system.message.showInvalidInput();
            }
        }
    }

    public void showMenuISoccer(System system){
        boolean done = false;
        while(!done){
            system.message.showTitleMenuFULL("ISOCCER MENU");
            system.menu.showGeneralCategories();
            try{
                int command = system.utility.readInteger();
                switch (command){
                    case 1:
                        this.showMenuGeneralEmployee(system);
                        break;
                    case 2:
                        this.showMenuGeneralSupporter(system);
                        break;
                    case 3:
                        this.showMenuGeneralResource(system);
                        break;
                    case 0:
                        done = true;
                        break;
                    default:
                        system.message.showInvalidInput();
                }

            }catch (NumberFormatException e){
                system.message.showInvalidInput();
            }
        }
    }

}
