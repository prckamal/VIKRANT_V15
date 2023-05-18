public class CommandLineArgument {

    public static void main(String[] args){

        int validSum = 0;
        int invalidSum = 0;

        for(int i=0; i<args.length;i++){
            try{
                validSum +=Integer.parseInt(args[i]);
            }catch(Exception e){
                invalidSum += 1;
            }
        }
        System.out.println("Sum of value: " +validSum);
        System.out.println("Sum of invalid value: " +invalidSum);
    }
}
