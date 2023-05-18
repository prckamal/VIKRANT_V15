import java.time.Clock;


public class FindMaxMin {

    public void additionOfNumber(int a, int b) {

        if (a > b) {
            System.out.println("Max Number is: " + a );
            System.out.println("Min Number is: " + b );
        } else {
            System.out.println("Max Number is: " + b);
            System.out.println("Min Number is: " + a);
        }
    }
    public void arithmeticOperation(int num1,int num2,int num3){
        System.out.println("a+b*c = "+num1+num2*num3);
        System.out.println("c+a/b = "+num1+num2/num3);
        System.out.println("a%b+c = "+num1%num2+num3);
        System.out.println("a*b+c = "+num1*num2+num3);

        }

    public static void main(String[] args){
        int val1=Integer.parseInt(args[0]);
        int val2=Integer.parseInt(args[1]);
        int val3=Integer.parseInt(args[2]);
        FindMaxMin f=new FindMaxMin();
        f.additionOfNumber(val1,val2);
        f.arithmeticOperation(val1,val2,val3);

    }
}
