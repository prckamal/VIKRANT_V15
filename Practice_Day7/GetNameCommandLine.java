public class GetNameCommandLine {

    public static void main(String[] args){

        if (args.length !=0){
            System.out.println("Entered Name:" +args[0]);
        }
        else{
            System.out.println("Name not entered");
        }
    }
}
