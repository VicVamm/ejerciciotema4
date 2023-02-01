package openbc.smartdevices;

public class Main {
    public static void main(String[] args) {

        SmartDevice genericDevice = new SmartDevice(1, "x", "x", "android", true, 0.0, 1000, false, false, true);
        SmartPhone iPhone = new SmartPhone(2, "iPhone", "Apple", "iOs", true, 6.06, 100, true, true, true, 48.0, 6, 64 );
        SmartWatch appleWatch = new SmartWatch(3, "AppleWatch", "Apple", "iOs", true, 0.44, 100, true, false, true, true, true, true, true, 0.0, 0, "calling", 0.0 );


        //SmartDevice
        System.out.println(genericDevice.getBrand());

        //SmartPhone
        iPhone.descargaBateria(5);
        System.out.println(iPhone.getBatteryLife());

        //SmartWatch
        System.out.println(appleWatch.getModel() + " " + appleWatch.getBrand());

    }
}