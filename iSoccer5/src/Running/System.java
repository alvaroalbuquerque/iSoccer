package Running;

import Methods.DataMethod;
import Methods.MenusMethod;
import Methods.PersonMethodPackage.EmployeeMethodPackage.*;
import Methods.PersonMethodPackage.SupporterMethod;
import Methods.ResourceMethodPackage.BusMethod;
import Methods.ResourceMethodPackage.StadiumMethod;
import Methods.ResourceMethodPackage.TrainingCenterMethod;
import Methods.Utility;
import Model.Data;
import Print.*;

public class System {
    public Menus menu = new Menus();
    public Data data = new Data();
    public Utility utility = new Utility();
    public Message message = new Message();
    public MenusMethod menusMethod = new MenusMethod();
    public DataPrint dataPrint = new DataPrint(data,message,utility);
    public DataMethod dataMethod = new DataMethod(data,utility,message);

    public PresidentMethod presidentMethod = new PresidentMethod(data,utility,message,dataMethod);
    public DoctorMethod doctorMethod = new DoctorMethod(data,utility,message,dataMethod);
    public PlayerMethod playerMethod = new PlayerMethod(data,utility,message,dataMethod);
    public LawyerMethod lawyerMethod = new LawyerMethod(data,utility,message,dataMethod);
    public CoachMethod coachMethod = new CoachMethod(data,utility,message,dataMethod);
    public PersonalTrainerMethod personalTrainerMethod = new PersonalTrainerMethod(data,utility,message,dataMethod);
    public DriverMethod driverMethod = new DriverMethod(data,utility,message,dataMethod);
    public CookerMethod cookerMethod = new CookerMethod(data,utility,message,dataMethod);

    public SupporterMethod supporterMethod = new SupporterMethod(data,utility,message,dataMethod);

    public TrainingCenterMethod trainingCenterMethod = new TrainingCenterMethod(data,dataMethod,utility,message);
    public StadiumMethod stadiumMethod = new StadiumMethod(data,dataMethod,utility,message);
    public BusMethod busMethod = new BusMethod(data,dataMethod,utility,message);

}
