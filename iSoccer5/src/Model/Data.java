package Model;

import Model.PersonPackage.EmployeePackage.*;
import Model.PersonPackage.Supporter;
import Model.ResourcePackage.Bus;
import Model.ResourcePackage.Stadium;
import Model.ResourcePackage.TrainingCenter;
import java.util.ArrayList;

public class Data {
    //login
    private String login = "123";
    private String password = "123";

    //ST info
    private double topJunior;
    private double topSenior;

    //Employees

    private President president;
    private Coach coach;
    private Doctor doctor;
    private ArrayList<Player> players;
    private ArrayList<Driver> drivers;
    private ArrayList<PersonalTrainer> personalTrainers;
    private ArrayList<Cooker> cookers;
    private ArrayList<Lawyer> lawyers;

    //Supporters
    private ArrayList<Supporter> supporters;

    //Recursos Fisicos
    private TrainingCenter trainingCenter;
    private Stadium stadium;
    private ArrayList<Bus> vehicles;

    public Data(){
        this.president = new President(null, null, null, null, 0, 0);
        this.coach = new Coach(null, null, null, null, 0, 0);
        this.doctor = new Doctor(null,null,null,null,0, null);
        this.players = new ArrayList<>();
        this.drivers = new ArrayList<>();
        this.personalTrainers = new ArrayList<>();
        this.cookers = new ArrayList<>();
        this.lawyers = new ArrayList<>();

        //Socio-Torcedor
        this.supporters = new ArrayList<>();

        //Recursos Fisicos
        this.trainingCenter = new TrainingCenter(null,false, 0);
        this.stadium = new Stadium(null, false, 0,0,0);
        this.vehicles = new ArrayList<>();

        topJunior = 50;
        topSenior = 200;
    }

    public double getTopJunior() {
        return topJunior;
    }

    public void setTopJunior(double topJunior) {
        this.topJunior = topJunior;
    }

    public double getTopSenior() {
        return topSenior;
    }

    public void setTopSenior(double topSenior) {
        this.topSenior = topSenior;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public President getPresident() {
        return president;
    }

    public void setPresident(President president) {
        this.president = president;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(ArrayList<Driver> drivers) {
        this.drivers = drivers;
    }

    public ArrayList<PersonalTrainer> getPersonalTrainers() {
        return personalTrainers;
    }

    public void setPersonalTrainers(ArrayList<PersonalTrainer> personalTrainers) {
        this.personalTrainers = personalTrainers;
    }

    public ArrayList<Cooker> getCookers() {
        return cookers;
    }

    public void setCookers(ArrayList<Cooker> cookers) {
        this.cookers = cookers;
    }

    public ArrayList<Lawyer> getLawyers() {
        return lawyers;
    }

    public void setLawyers(ArrayList<Lawyer> lawyers) {
        this.lawyers = lawyers;
    }

    public ArrayList<Supporter> getSupporters() {
        return supporters;
    }

    public void setSupporters(ArrayList<Supporter> supporters) {
        this.supporters = supporters;
    }

    public TrainingCenter getTrainingCenter() {
        return trainingCenter;
    }

    public void setTrainingCenter(TrainingCenter trainingCenter) {
        this.trainingCenter = trainingCenter;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public ArrayList<Bus> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Bus> vehicles) {
        this.vehicles = vehicles;
    }
}
