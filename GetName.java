import java.util.Scanner;

public class GetName {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Entered name:  " + name);

        sc.close();

    }
}
