package Model.ResourcePackage;

import Model.Resource;

public class Stadium extends Resource {
    private int nMaxSupporter, nWC, nCafe;

    public Stadium(String managerName, boolean available, int nMaxSupporter, int nWC, int nCafe) {
        super(managerName, available);
        this.nMaxSupporter = nMaxSupporter;
        this.nWC = nWC;
        this.nCafe = nCafe;
    }

    public int getnMaxSupporter() {
        return nMaxSupporter;
    }

    public void setnMaxSupporter(int nMaxSupporter) {
        this.nMaxSupporter = nMaxSupporter;
    }

    public int getnWC() {
        return nWC;
    }

    public void setnWC(int nWC) {
        this.nWC = nWC;
    }

    public int getnCafe() {
        return nCafe;
    }

    public void setnCafe(int nCafe) {
        this.nCafe = nCafe;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Maximum Number of Supporters: " + nMaxSupporter +
                "\nNumber of WC: " + nWC +
                "\nNumber of Cafes: " + nCafe +
                '\n';
    }

}
