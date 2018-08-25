package Print;

public class Menus {
    public void showGeneralCategories(){
        System.out.println("1. Employees\n" +
                "2. Supporters\n" +
                "3. Resources\n" +
                "0. Exit");

    }
    public void showEmployeesMenu(){
        System.out.println("1. Add Employee\n" +
                "2. Edit Player Capability\n" +
                "3. Report\n" +
                "4. Edit Info\n" +
                "5. Remove Employee\n" +
                "0. Back");
    }
    public void showResourceMenu(){
        System.out.println("1. Add Resource\n" +
                "2. Check availability\n" +
                "3. Report\n" +
                "4. Edit Information\n" +
                "5. Remove Resource\n" +
                "0. Back");

    }
    public void showSupporterMenu(){
        System.out.println("1. Add Supporter\n" +
                "2. Register Payment\n" +
                "3. Report\n" +
                "4. Change ranking values\n" +
                "5. Reset Payment\n" +
                "6. Edit Information\n" +
                "7. Remove Supporter\n" +
                "0. Back");
    }
    public void showEmployeeCategory(){
        System.out.println("1. President\n" +
                "2. Doctor\n" +
                "3. Coach\n" +
                "4. Personal Trainers\n" +
                "5. Drivers\n" +
                "6. Cookers\n" +
                "7. Lawyers\n" +
                "8. Players");
    }

    public void showEmployeeReportCategory(){
        System.out.println("1. President\n" +
                "2. Doctor\n" +
                "3. Coach + Players\n" +
                "4. Personal Trainers\n" +
                "5. Drivers\n" +
                "6. Cookers\n" +
                "7. Lawyers");
    }
    public void showResourceCategory(){
        System.out.println("1. Stadium\n" +
                "2. Training Center\n" +
                "3. Vehicles");

    }
}
