package Model;

public class Resource {
    protected String managerName;
    protected boolean available;

    public Resource(String managerName, boolean available) {
        this.managerName = managerName;
        this.available = available;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Manager's Name: " + this.managerName + '\n';
    }
}
