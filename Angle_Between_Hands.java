import java.util.Scanner;
import java.io.*;
class area{
    public static void main(String [] args){
        Scanner k=new Scanner(System.in);
    
    String sr=k.next();
    char s=sr.charAt(0);
    char s1=sr.charAt(1);
    char s2=sr.charAt(3);
    char s3=sr.charAt(4);
    String mm="";
    String sr1= mm + s + s1;
    String sr2= mm + s2 + s3;
    double h=Double.parseDouble(sr1);
    double m=Double.parseDouble(sr2);
    
    if (h==12.0){
        h=0;
    }
    if (m==60.0){
        m=0;
    }
    double hrangle=0.5*((h*60)+m);
    double mnangle=6*m;
    double angle=Math.abs(hrangle-mnangle);
    if(360-angle>angle){
        System.out.println(angle);
    }else{
        System.out.println(360-angle);
    }

    }
    
}