import java.util.Scanner;

public class CommandLineSum {
    int invalidCount = 0;
    int sum = 0;
    Integer[] val=new Integer[10];

    public void display_count(){
        Scanner sc1 = new Scanner(System.in);


        for (int i = 0; i < val.length; i++) {
            try{
                val[i] = Integer.parseInt(sc1.nextLine());
                sum +=val[i];
            } catch(NumberFormatException e) {
                invalidCount++;
            }

        }


        System.out.println("Sum of valid integers: " + sum);
        System.out.println("Number of invalid integers: " + invalidCount);

    }
    public static void main(String[] args) {
        CommandLineSum c = new CommandLineSum();
        c.display_count();
    }
}
