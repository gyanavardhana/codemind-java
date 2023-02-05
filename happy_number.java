import java.util.*;
class J{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
    int n,sq,r,s=0,p=0,k,s1=0,i,c=0,j;
    n=sc.nextInt();
      while(n>0)
    {
        r=n%10;
        sq=r*r;
        s+=sq;
        n=n/10;
    }
    s1=s;
    while(c!=1)
    {
       c=0;
       k=s1;
       s1=0;
       while(k>0)
       {
           r=k%10;
           sq=r*r;
           s1=s1+sq;
           k=k/10;
       }
       j=s1;
       while(j>0)
       {
           r=j%10;
           c++;
           j=j/10;
       }
       if(s1==1 || s1==7)
       {
           System.out.println("True");
           p=1;
           break;
       }
    }  
    if(p!=1)
    {
        System.out.println("False");
    }
   
    }
}