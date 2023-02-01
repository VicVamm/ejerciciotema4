package openbc.smartdevices;

public class SmartDevice {
    //Propiedades
        private int id;
        private String model;
        private String brand;
        private String operatingSystem;
        private boolean internetConnectivity;
        private double screenSize;
        private Integer batteryLife;
        private boolean batteryInalambricCharge;
        private boolean camera;
        private boolean gps;

    //Constructores
        public SmartDevice(){} //sin parámetro
        //con todos los parámetros
        public SmartDevice(int id, String model, String brand, String operatingSystem, boolean internetConnectivity, double screenSize, Integer batteryLife, boolean batteryInalambricCharge, boolean camera, boolean gps) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.internetConnectivity = internetConnectivity;
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
        this.batteryInalambricCharge = batteryInalambricCharge;
        this.camera = camera;
        this.gps = gps;
    }
        //parámetros generales
        public SmartDevice(String model, String brand, String operatingSystem) {
        this.model = model;
        this.brand = brand;
        this.operatingSystem = operatingSystem;
    }

    //métodos
    public void descargaBateria(int descarga) {
        this.batteryLife -= descarga;
    }


    //Getter y setter
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getModel() {
            return model;
        }
        public void setModel(String model) {
            this.model = model;
        }
        public String getBrand() {
            return brand;
        }
        public void setBrand(String brand) {
            this.brand = brand;
        }
        public String getOperatingSystem() {
            return operatingSystem;
        }
        public void setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
        }
        public boolean isInternetConnectivity() {
            return internetConnectivity;
        }
        public void setInternetConnectivity(boolean internetConnectivity) {
            this.internetConnectivity = internetConnectivity;
        }
        public double getScreenSize() {
            return screenSize;
        }
        public void setScreenSize(double screenSize) {
            this.screenSize = screenSize;
        }
        public Integer getBatteryLife() {
            return batteryLife;
        }
        public void setBatteryLife(Integer batteryLife) {
            this.batteryLife = batteryLife;
        }
        public boolean isBatteryInalambricCharge() {
            return batteryInalambricCharge;
        }
        public void setBatteryInalambricCharge(boolean batteryInalambricCharge) {
            this.batteryInalambricCharge = batteryInalambricCharge;
        }
        public boolean isCamera() {
            return camera;
        }
        public void setCamera(boolean camera) {
            this.camera = camera;
        }
        public boolean isGps() {
            return gps;
        }
        public void setGps(boolean gps) {
            this.gps = gps;
        }
}
