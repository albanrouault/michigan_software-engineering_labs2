package design.composite;

public class TestCompositePattern {
    public static void main(String[] args) {

        System.out.println("-------------- Composite Pattern - TEST ------------------");

        System.out.println("\n-------------- Without recursive ------------------");
        Drawing drawing = new Drawing();
        drawing.add(new Circle());
        drawing.add(new Square());
        drawing.add(new Triangle());
        drawing.draw("red");
        drawing.draw("blue");

        System.out.println("\n-------------- With recursive ------------------");
        Drawing drawing2 = new Drawing();
        drawing2.add(drawing);
        drawing2.add(new Circle());
        
        Drawing drawing3 = new Drawing();
        drawing3.add(drawing2);
        drawing3.add(drawing);
        drawing3.add(new Square());
        drawing3.add(new Triangle());
        drawing3.draw("green");

    }
}
