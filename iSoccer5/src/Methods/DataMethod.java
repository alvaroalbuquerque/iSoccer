package Methods;

import Model.Data;
import Model.PersonPackage.*;
import Model.PersonPackage.EmployeePackage.*;
import Model.Resource;
import Model.ResourcePackage.*;
import Print.Message;

public class DataMethod {
    Data data;
    Utility utility;
    Message message;

    public DataMethod(Data data, Utility utility, Message message) {
        this.data = data;
        this.utility = utility;
        this.message = message;
    }

    public void editCoach(Coach coach){
        Coach oldCoach = data.getCoach();
        oldCoach.setName(coach.getName());
        oldCoach.setCpf(coach.getCpf());
        oldCoach.setEmail(coach.getCpf());
        oldCoach.setTelephone(coach.getTelephone());
        oldCoach.setSalary(coach.getSalary());
        oldCoach.setMatchesCoached(coach.getMatchesCoached());

        message.showSuccessMessage();
    }
    public void editPresident(President president){
        President oldPresident = data.getPresident();
        oldPresident.setName(president.getName());
        oldPresident.setCpf(president.getCpf());
        oldPresident.setEmail(president.getCpf());
        oldPresident.setTelephone(president.getTelephone());
        oldPresident.setSalary(president.getSalary());
        oldPresident.setBanked(president.getBanked());

        message.showSuccessMessage();
    }
    public void editDoctor(Doctor doctor){
        Doctor oldDoctor = data.getDoctor();
        oldDoctor.setName(doctor.getName());
        oldDoctor.setCpf(doctor.getCpf());
        oldDoctor.setEmail(doctor.getCpf());
        oldDoctor.setTelephone(doctor.getTelephone());
        oldDoctor.setSalary(doctor.getSalary());
        oldDoctor.setCrm(doctor.getCrm());

        message.showSuccessMessage();

    }
    public void editCooker(Cooker cooker, int index){

        Cooker oldCooker = data.getCookers().get(index);
        oldCooker.setName(cooker.getName());
        oldCooker.setCpf(cooker.getCpf());
        oldCooker.setEmail(cooker.getCpf());
        oldCooker.setTelephone(cooker.getTelephone());
        oldCooker.setSalary(cooker.getSalary());
        oldCooker.setSchooling(cooker.getSchooling());

        message.showSuccessMessage();
    }
    public void editDriver(Driver driver, int index){
        Driver oldDriver = data.getDrivers().get(index);

        oldDriver.setName(driver.getName());
        oldDriver.setCpf(driver.getCpf());
        oldDriver.setEmail(driver.getCpf());
        oldDriver.setTelephone(driver.getTelephone());
        oldDriver.setSalary(driver.getSalary());
        oldDriver.setCnh(driver.getCnh());

        message.showSuccessMessage();
    }
    public void editLawyer(Lawyer lawyer, int index){

        Lawyer oldLawyer = data.getLawyers().get(index);

        oldLawyer.setName(lawyer.getName());
        oldLawyer.setCpf(lawyer.getCpf());
        oldLawyer.setEmail(lawyer.getCpf());
        oldLawyer.setTelephone(lawyer.getTelephone());
        oldLawyer.setSalary(lawyer.getSalary());
        oldLawyer.setOab(lawyer.getOab());

        message.showSuccessMessage();
    }
    public void editPersonalTrainer(PersonalTrainer personalTrainer, int index){

        PersonalTrainer oldPTrainer = data.getPersonalTrainers().get(index);

        oldPTrainer.setName(personalTrainer.getName());
        oldPTrainer.setCpf(personalTrainer.getCpf());
        oldPTrainer.setEmail(personalTrainer.getCpf());
        oldPTrainer.setTelephone(personalTrainer.getTelephone());
        oldPTrainer.setSalary(personalTrainer.getSalary());
        oldPTrainer.setSchooling(personalTrainer.getSchooling());

        message.showSuccessMessage();
    }
    public void editPlayer(Player player, int index){

        Player oldPlayer = data.getPlayers().get(index);

        oldPlayer.setName(player.getName());
        oldPlayer.setCpf(player.getCpf());
        oldPlayer.setEmail(player.getCpf());
        oldPlayer.setTelephone(player.getTelephone());
        oldPlayer.setSalary(player.getSalary());
        oldPlayer.setPositionPlayer(player.getPositionPlayer());

        message.showSuccessMessage();
    }

    public void editSupporter(Supporter supporter, int index){

        Supporter oldSupporter = data.getSupporters().get(index);

        oldSupporter.setName(supporter.getName());
        oldSupporter.setCpf(supporter.getCpf());
        oldSupporter.setEmail(supporter.getCpf());
        oldSupporter.setTelephone(supporter.getTelephone());
        oldSupporter.setContributionValue(supporter.getContributionValue());
        oldSupporter.setType(oldSupporter.typeFromContribution());

        message.showSuccessMessage();
    }

    public void editBus(String nManagerName, int index){
        Bus oldBus = data.getVehicles().get(index);
        oldBus.setManagerName(nManagerName);

        message.showSuccessMessage();
    }
    public void editTrainingCenter(String managerName, int nDormitories){
        TrainingCenter oldTCenter = data.getTrainingCenter();
        oldTCenter.setManagerName(managerName);
        oldTCenter.setnDormitories(nDormitories);

        message.showSuccessMessage();

    }
    public void editStadium(String managerName, int nSupporters, int nBathrooms, int nCafe){
        Stadium oldStadium = data.getStadium();
        oldStadium.setManagerName(managerName);
        oldStadium.setnMaxSupporter(nSupporters);
        oldStadium.setnWC(nBathrooms);
        oldStadium.setnCafe(nCafe);

        message.showSuccessMessage();

    }

    public void addingEmployee(int i, Employee newEmployee){
        switch (i){
            case 1:
                data.setPresident((President) newEmployee);
                break;
            case 2:
                data.setDoctor((Doctor) newEmployee);
                break;
            case 3:
                data.setCoach((Coach) newEmployee);
                break;
            case 4: //PF
                data.getPersonalTrainers().add((PersonalTrainer) newEmployee);
                break;
            case 5: //Motor
                data.getDrivers().add((Driver) newEmployee);
                break;
            case 6: //Cozinheiros
                data.getCookers().add((Cooker) newEmployee);
                break;
            case 7: //Advogados
                data.getLawyers().add((Lawyer) newEmployee);
                break;
            case 8: //Jogadores
                data.getPlayers().add((Player) newEmployee);
                break;
        }
    }
    public void addingSupporter(Supporter newSupporter){
        data.getSupporters().add(newSupporter);
    }
    public void addingResource(int i, Resource resource){
        switch (i){
            case 1:
                data.getVehicles().add((Bus) resource);
                break;
            case 2:
                data.setStadium((Stadium) resource);
                break;
            case 3:
                data.setTrainingCenter((TrainingCenter) resource);
                break;
        }
    }


}
