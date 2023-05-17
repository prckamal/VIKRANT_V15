import java.util.Scanner;

public class CheckTwoStrings {
    public void checkString(String a, String b){

        if (a.equals(b)){
            System.out.println("Entered strings are equal");
        }
        else {
            System.out.println("Entered strings are not equal");
        }
    }
    public static void main(String[] args){

        Scanner sc1 = new Scanner(System.in);
        String[] string = new String[2];
        for (int i = 0; i < string.length; i++)
        {
            string[i] = sc1.nextLine();
        }
        CheckTwoStrings c= new CheckTwoStrings();
        c.checkString(string[0],string[1]);
    }
}
