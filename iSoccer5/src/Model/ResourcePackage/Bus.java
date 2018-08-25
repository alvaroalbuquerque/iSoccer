package Model.ResourcePackage;

import Model.Resource;

public class Bus extends Resource {
    private String plate;

    public Bus(String managerName, boolean available, String plate) {
        super(managerName, available);
        this.plate = plate;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public String toString() {
        return super.toString() +
                "License Plate: " + plate + '\n';
    }
}
