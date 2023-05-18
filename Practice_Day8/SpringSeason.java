public class SpringSeason {
    public void checkSpringSeason(int m,int d){
        boolean isSpringSeason;
        isSpringSeason = (m>3 && m<6) || (m==3 && d>=20) || (m==6 && d<=20);
        if (isSpringSeason){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }

    public static void main(String[] args){

        int m = Integer.parseInt(args[0]);
        System.out.println("Enter Month: "+ m);

        int n = Integer.parseInt(args[1]);
        System.out.println("Enter Date: "+n);

        SpringSeason s = new SpringSeason();
        s.checkSpringSeason(m,n);
    }
}
