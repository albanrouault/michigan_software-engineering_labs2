package design.composite;

public class Square implements Shape {
    @Override
    public void draw(String color) {
        System.out.println("Drawing Square with color: " + color);
    }
}
