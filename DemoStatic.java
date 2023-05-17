public class DemoStatic {
    // Static variable
    private static int staticVariable = 0;

    // Static block
    static {
        System.out.println("This is a static block.");
        staticVariable = 10;
    }

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
        System.out.println("Static variable value: " + staticVariable);
    }

    public static void main(String[] args) {
        // Accessing static variable
        System.out.println("Static variable value: " + staticVariable);

        // Accessing static method
        staticMethod();
    }
}