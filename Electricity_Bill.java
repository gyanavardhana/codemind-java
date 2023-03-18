
import java.util.Scanner;
class Java
    
    
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a,b;
        int c;
        float k,d,m;
        a=sc.nextLine();
        b=sc.nextLine();
        c=sc.nextInt();
        if(c<200)
        {
           k=c*1.2f;
        }
        else if(c>=200 && c<400){
           k=c*1.5f;
        }
        else if(c>=400 && c<600){
           k=c*1.8f;
        }
        else
        {
           k=c*2f;
        }
        if(k<400)
        {
          System.out.format("%.2f",k+100);
        }
        else
        {
          d=((float)(k*15)/100);
            m=k+d;
            System.out.format("%.2f",m);
        }
    }
}
