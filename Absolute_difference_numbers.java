import java.util.*;
class H{
    public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      int a,a1,c1=0,n1=0,a2,b,d,n=0,m=0,c,n2=0;
      a=s.nextInt();
      b=s.nextInt();
      c=0;
      a1=a;
      while(a>0){
          d=a%10;
          m=m*10+d;
          a=a/10;
      }
      while(c<b){
          d=a1%10;
          n=n*10+d;
          c++;
          a1=a1/10;
      }
       while(c1<b){
          d=m%10;
          n1=n1*10+d;
          c1++;
          m=m/10;
      }
      while(n>0){
          d=n%10;
          n2=n2*10+d;
          n=n/10;
      }
      if(n2>n1){
          System.out.println(n2-n1);
      }
      else{
      System.out.println(n1-n2);
      }
    }
}