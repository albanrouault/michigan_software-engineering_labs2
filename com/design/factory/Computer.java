package design.factory;
public abstract class Computer {
    private String ram;
    private String hdd;
    private String cpu;

    public Computer() {
        this.ram = "";
        this.hdd = "";
        this.cpu = "";
    }

    public Computer(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
    }
}