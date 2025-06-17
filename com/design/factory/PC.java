package design.factory;

public class PC extends Computer {
    // Constructeur
    public PC() {
        super();
    }

    public PC(String ram, String hdd, String cpu) {
        super(ram, hdd, cpu);
    }
}
