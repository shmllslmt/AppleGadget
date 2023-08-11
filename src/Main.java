public class Main {
    public static void main(String[] args) {
        iPhone iPhone = new iPhone("iPhone", "15", 256);
        iPad iPad = new iPad();
        Macbook macbook = new Macbook("Macbook", "Air", 128);

        AppleGadgetNetwork network = new AppleGadgetNetwork();
        network.addDevice(iPhone);
        network.addDevice(iPad);
        network.addDevice(macbook);

        network.sendData(iPad, iPhone, "I need to present my project on 25 August 2023!");

        network.displayDevices();
    }
}