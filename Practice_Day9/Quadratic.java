import static java.lang.Math.sqrt;


public class Quadratic {

    public void calc(int a,int b,int c) {
        double delta=0.0;
        double root1=0.0;
        double root2=0.0;

        delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            System.out.println("The equation has no real roots.");
        }
        else {
            root1 = (-b + sqrt(delta)) / (2 * a);
            root2 = (-b - sqrt(delta)) / (2 * a);
            System.out.println("The equation has two roots: " + root1 + " and " + root2);
            System.out.println("Equation of the root1(a*x*x + b*x + c) : "+ (a*root1*root1) + (b*root1) + c);
            System.out.println("Equation of the root2(a*x*x + b*x + c) : "+ (a*root2*root2) + (b*root2) + c);
        }
    }
    public static void main(String[] args){

        int a = Integer.parseInt(args[0]);
        System.out.println("Enter A value: "+ a);
        int b = Integer.parseInt(args[1]);
        System.out.println("Enter B value: "+ b);
        int c = Integer.parseInt(args[2]);
        System.out.println("Enter C value: "+ c);

        Quadratic q = new Quadratic();
        q.calc(a,b,c);
    }
}
