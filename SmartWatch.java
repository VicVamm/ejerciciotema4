package openbc.smartdevices;

public class SmartWatch extends SmartDevice {
    //propiedades
    private boolean screenTouch;
    private boolean receiveMessages;
    private boolean receiveCalls;
    private boolean heartRate;
    private double heartRateMeasurement;
    private int stepCounter;
    private String phoneLocator;
    private double sleepingHours;

    //constructor
    public SmartWatch(){}
    public SmartWatch(int id, String model, String brand, String operatingSystem, boolean internetConnectivity, double screenSize, Integer batteryLife, boolean batteryInalambricCharge, boolean camera, boolean gps, boolean screenTouch, boolean receiveMessages, boolean receiveCalls, boolean heartRate, double heartRateMeasurement, int stepCounter, String phoneLocator, double sleepingHours) {
        super(id, model, brand, operatingSystem, internetConnectivity, screenSize, batteryLife, batteryInalambricCharge, camera, gps);
        this.screenTouch = screenTouch;
        this.receiveMessages = receiveMessages;
        this.receiveCalls = receiveCalls;
        this.heartRate = heartRate;
        this.heartRateMeasurement = heartRateMeasurement;
        this.stepCounter = stepCounter;
        this.phoneLocator = phoneLocator;
        this.sleepingHours = sleepingHours;
    }

    //getter y setter
    public boolean isScreenTouch() {
        return screenTouch;
    }
    public void setScreenTouch(boolean screenTouch) {
        this.screenTouch = screenTouch;
    }
    public boolean isReceiveMessages() {
        return receiveMessages;
    }
    public void setReceiveMessages(boolean receiveMessages) {
        this.receiveMessages = receiveMessages;
    }
    public boolean isReceiveCalls() {
        return receiveCalls;
    }
    public void setReceiveCalls(boolean receiveCalls) {
        this.receiveCalls = receiveCalls;
    }
    public boolean isHeartRate() {
        return heartRate;
    }
    public void setHeartRate(boolean heartRate) {
        this.heartRate = heartRate;
    }
    public double getHeartRateMeasurement() {
        return heartRateMeasurement;
    }
    public void setHeartRateMeasurement(double heartRateMeasurement) {
        this.heartRateMeasurement = heartRateMeasurement;
    }
    public int getStepCounter() {
        return stepCounter;
    }
    public void setStepCounter(int stepCounter) {
        this.stepCounter = stepCounter;
    }
    public String getPhoneLocator() {
        return phoneLocator;
    }
    public void setPhoneLocator(String phoneLocator) {
        this.phoneLocator = phoneLocator;
    }
    public double getSleepingHours() {
        return sleepingHours;
    }
    public void setSleepingHours(double sleepingHours) {
        this.sleepingHours = sleepingHours;
    }
}
