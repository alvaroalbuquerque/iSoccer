package Model.ResourcePackage;

import Model.Resource;

public class TrainingCenter extends Resource {
    private int nDormitories;

    public TrainingCenter(String managerName, boolean available, int nDormitories) {
        super(managerName, available);
        this.nDormitories = nDormitories;
    }

    public int getnDormitories() {
        return nDormitories;
    }

    public void setnDormitories(int nDormitories) {
        this.nDormitories = nDormitories;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Number of Dormitories: " + nDormitories +
                '\n';
    }
}
