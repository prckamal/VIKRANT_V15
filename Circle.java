public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0); // Creating an instance of Circle with radius 5.0

        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle circumference: " + circle.calculateCircumference());

        // Updating the radius and recalculating the area and circumference
        circle.setRadius(7.5);
        System.out.println("\nCircle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle circumference: " + circle.calculateCircumference());
    }
}
