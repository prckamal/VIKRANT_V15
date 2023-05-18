import static java.lang.Math.sqrt;

public class Distance {

    public void calc(int x,int y){
        double distance;
        distance = sqrt((x*x) + (y*y));
        System.out.println("Distance: "+distance);
    }

    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        System.out.println("Enter X value: "+ x);
        int y = Integer.parseInt(args[1]);
        System.out.println("Enter Y value: "+ y);

        Distance d = new Distance();
        d.calc(x,y);
    }
}
