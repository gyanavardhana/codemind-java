import java.util.*;
class J{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
    int a,b,c=0,num=0,rev=0,d,sq,sq1;
    a=sc.nextInt();
    sq=a*a;
    while(a!=0)
    {
        d=a%10;
        rev=rev*10+d;
        a=a/10;
    }
    sq1=rev*rev;
    while(sq1!=0)
    {
        d=sq1%10;
        num=num*10+d;
        sq1=sq1/10;
    }
    if(sq==num)
    {
         System.out.println("True");
    }
    else
    {
        System.out.println("False");
    }
    }
    
}