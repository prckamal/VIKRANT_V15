public class LargestElementInArray {

    public void printLargestElement(int[] args){

        //Entered element
        for(int i=0;i<args.length;i++){
            System.out.println("Entered element: "+args[i]);
        }
        //validate element
        int num = args[1];
        for(int i=0;i<args.length;i++){
            if(args[i] > num){
                num=args[i];
            }
        }
        //Display element
        System.out.println("Largest Element is: "+num);
    }
    public static void main(String[] args){
        int[] val;
        val = new int[5];
        if(args.length > 5){
            System.out.println("Please enter five elements only");
            return;
        }
        LargestElementInArray l = new LargestElementInArray();
        for(int i=0;i<args.length;i++){
            val[i] = Integer.parseInt(args[i]);
        }
        l.printLargestElement(val);
    }
}
