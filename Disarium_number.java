import java.util.*;
class J{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,n,d,r=0,c=0,r1=0;
        n=sc.nextInt();
        a=n;
        b=n;
        while(n>0){
            d=n%10;
            r=r*10+d;
            c++;
            n=n/10;
        }
        while(a>0){
            d=a%10;
            r1=r1+(int)Math.pow(d,c);
            c--;
            a=a/10;
        }
        if(r1==b){
            System.out.println("True");
        }
        else{
             System.out.println("False");
        }
    }
}