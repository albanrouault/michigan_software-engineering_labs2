package design.factory;

public class Server extends Computer {
    // Constructeur
    public Server() {
        super();
    }

    public Server(String ram, String hdd, String cpu) {
        super(ram, hdd, cpu);
    }
}
