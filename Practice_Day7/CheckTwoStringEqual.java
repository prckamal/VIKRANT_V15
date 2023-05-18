public class CheckTwoStringEqual {

    public static void main(String[] args){

        if (args.length !=2){
            System.out.println("Enter two strings:");
            return;
        }
        String val1 = args[0];
        String val2 = args[1];

        if (val1.equals(val2)){
            System.out.println("Two strings are equal:");
        }
        else{
            System.out.println("Two strings are not equal:");
        }
    }
}
