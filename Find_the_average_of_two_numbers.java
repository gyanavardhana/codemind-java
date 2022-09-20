import java.util.Scanner;
import java.io.*;
class avg{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        double b=s.nextDouble();
        double sum=(a+b)/2;
        System.out.printf("%.4f",sum);
    }
}