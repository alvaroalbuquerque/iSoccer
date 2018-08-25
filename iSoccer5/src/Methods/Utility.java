package Methods;

import Model.Person;
import Model.PersonPackage.Employee;
import Model.Resource;
import Model.ResourcePackage.Bus;

import java.util.ArrayList;
import java.util.Scanner;

public class Utility {
    Scanner input = new Scanner(System.in);
    public double readDouble() throws NumberFormatException{
        double number = Double.parseDouble(input.nextLine());
        return number;
    }
    public int readInteger() throws NumberFormatException{
        int number = Integer.parseInt(input.nextLine());
        return number;
    }
    public String readString() {
        return input.nextLine();
    }

    public boolean thereIsSoloEmployee(Employee employee){
        if(employee.getName() != null){
            return true;
        }else{
            return false;
        }
    }
    public boolean thereIsArrayPerson(ArrayList<? extends Person> people){
        if(people.isEmpty()){
            return false;
        }else{
            return true;
        }
    }

    public boolean thereIsSoloResource(Resource resource){
        if(resource.getManagerName() != null){
            return true;
        }else{
            return false;
        }
    }

    public boolean thereIsArrayResource(ArrayList<? extends Resource> resources){
        if(resources.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
    public int indexOfPerson(String searchingEmail, ArrayList<? extends Person> array){
        for(Person object : array){
            if(object.getEmail().equals(searchingEmail)){
                return array.indexOf(object);
            }
        }
        return -1;
    }
    public int indexOfBus(String plate, ArrayList<Bus> array){
        for(Bus object : array){
            if(object.getPlate().equals(plate)){
                return array.indexOf(object);
            }
        }
        return -1;
    }
    public boolean isBigger(double a, double b){
        if(a > b){
            return true;
        }else{
            return false;
        }
    }

    public void removingSoloEmployee(Employee employee){
        employee.setName(null);
        employee.setEmail(null);
        employee.setCpf(null);
    }
    public void removingSoloResource(Resource resource){
        resource.setManagerName(null);
    }
}
