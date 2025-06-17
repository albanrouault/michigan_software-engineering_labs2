package design.factory;
public class ComputerFactory {

    public static Computer getComputer(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }
        
        if (type.equalsIgnoreCase("PC")) {
            return new PC();
        } else if (type.equalsIgnoreCase("Server")) {
            return new Server();
        }
        
        throw new IllegalArgumentException("Invalid computer type: " + type);
    }

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }
        
        if (type.equalsIgnoreCase("PC")) {
            return new PC(ram, hdd, cpu);
        } else if (type.equalsIgnoreCase("Server")) {
            return new Server(ram, hdd, cpu);
        }
        
        throw new IllegalArgumentException("Invalid computer type: " + type);
    }
}
