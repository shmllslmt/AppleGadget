import java.util.ArrayList;

public class AppleGadgetNetwork {
    ArrayList<AppleDevice> devices;
    public AppleGadgetNetwork() {
        devices = new ArrayList<>();
    }
    public void addDevice(AppleDevice device) {
        devices.add(device);
    }
    public void sendData(AppleDevice sender, AppleDevice receiver, String data) {
        sender.sendData(data);
        receiver.receiveData(data);
    }

    public void displayDevices() {
        if(devices.isEmpty()) {
            System.out.println("No device is currently connected to the network");
        } else {
            System.out.println("The device(s) that are currently connected to the network:");
            for(AppleDevice device: devices) {
                System.out.println("   "+device);
            }
        }
    }
}
