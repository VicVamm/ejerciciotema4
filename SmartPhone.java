package openbc.smartdevices;

public class SmartPhone extends SmartDevice {

    //Properties
    private double cameraResolution;
    private Integer RAM;
    private Integer ROM;

    //constructores
    public SmartPhone() {}
    public SmartPhone(int id, String model, String brand, String operatingSystem, boolean internetConnectivity, double screenSize, Integer batteryLife, boolean batteryInalambricCharge, boolean camera, boolean gps, double cameraResolution, Integer RAM, Integer ROM) {
        super(id, model, brand, operatingSystem, internetConnectivity, screenSize, batteryLife, batteryInalambricCharge, camera, gps);
        this.cameraResolution = cameraResolution;
        this.RAM = RAM;
        this.ROM = ROM;
    }

    //getter y setter
    public double getCameraResolution() {
        return cameraResolution;
    }
    public void setCameraResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
    public Integer getRAM() {
        return RAM;
    }
    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }
    public Integer getROM() {
        return ROM;
    }
    public void setROM(Integer ROM) {
        this.ROM = ROM;
    }
}
