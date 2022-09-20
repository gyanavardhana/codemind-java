import java.util.Scanner;
import java.io.*;
class area{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        float x=s.nextFloat();
        float y=s.nextFloat();
        float z=s.nextFloat();
        float j=(x+y+z)/2;
        double key=Math.sqrt(j*(j-x)*(j-y)*(j-z));
        System.out.printf("%.2f",key);
    }
    
}