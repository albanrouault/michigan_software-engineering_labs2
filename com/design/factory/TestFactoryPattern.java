package design.factory;

public class TestFactoryPattern {
    public static void main(String[] args) {
        // Create a PC
        Computer pc = ComputerFactory.getComputer("PC");
        pc.setRam("16GB");
        pc.setHdd("1TB");
        pc.setCpu("Intel i7");
        System.out.println("PC Configuration: " + pc);

        // Create a Server
        Computer server = ComputerFactory.getComputer("Server"); 
        server.setRam("64GB");
        server.setHdd("2TB");
        server.setCpu("Intel Xeon");
        System.out.println("Server Configuration: " + server);

        // create a server with a factory method
        Computer server2 = ComputerFactory.getComputer("Server", "64GB", "2TB", "Intel Xeon");
        System.out.println("Server Configuration: " + server2);

        // create a PC with a factory method
        Computer pc2 = ComputerFactory.getComputer("PC", "16GB", "1TB", "Intel i7");
        System.out.println("PC Configuration: " + pc2);

        // Try invalid type
        try {
            ComputerFactory.getComputer("Invalid");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid computer type throws exception as expected: " + e.getMessage());
        }
    }
}
