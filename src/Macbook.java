public class Macbook implements AppleDevice {
    private String deviceName;
    private String model;
    private int storage;

    public Macbook() {
        this("Macbook", "Pro", 128);
    }
    public Macbook(String deviceName, String model, int storage) {
        this.deviceName = deviceName;
        this.model = model;
        this.storage = storage;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getModel() {
        return model;
    }

    public int getStorage() {
        return storage;
    }

    @Override
    public void connectToWiFi() {
        System.out.println(deviceName + " " + model +" is connecting to WiFi...");
    }

    @Override
    public void sendData(String data) {
        System.out.println(deviceName + " " + model + " sends " + data);
    }

    @Override
    public void receiveData(String data) {
        System.out.println(" to " + deviceName + " " + model);
    }

    @Override
    public String toString() {
        return deviceName + " " + model + " with storage capacity of " + storage + "GB";
    }
}
