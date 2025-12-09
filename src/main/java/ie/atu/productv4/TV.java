package ie.atu.productv4;

public class TV extends Product {

    private double screenSize;
    private String manufacture;

    public TV() {
        super();
        screenSize = 0;
        manufacture = "";
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nScreen Size: " + screenSize + " Inches" +
                "\nManufacture: " + manufacture;
    }
}
