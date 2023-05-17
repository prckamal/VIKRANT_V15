public class DefaultPrimitiveDataTypeValue {
    boolean a;
    byte b;
    short c;
    int d;
    long e;
    float f;
    double g;
    char h;

    public void displayValue(){
        System.out.println("Default value of boolean is "+a);
        System.out.println("Default value of byte is "+b);
        System.out.println("Default value of short is "+c);
        System.out.println("Default value of int is "+d);
        System.out.println("Default value of long is "+e);
        System.out.println("Default value of float is "+f);
        System.out.println("Default value of double is "+g);
        System.out.println("Default value of char is "+h);
    }
    public static void main(String arg[]){
        DefaultPrimitiveDataTypeValue dp= new DefaultPrimitiveDataTypeValue();
        dp.displayValue();
    }
}
