public class ThreeDimensionalArray {

    public static void main(String[] args){

        //declaration
        int[][][] value;

        //initialization
        value = new int[4][2][4];

        int num=1;

        //assigning values 
        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<4;k++){
                    value[i][j][k] = num;
                    num+=1;
                }
            }
        }
        //Display values
        System.out.println("Display Number:");
        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<4;k++){
                    System.out.print(value[i][j][k]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
