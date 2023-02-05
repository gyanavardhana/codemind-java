import java.util.*;
class J{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a,b;
        a=s.nextInt();
        b=s.nextInt();
        for(int i=1;i<=b;i+=2){
            System.out.print(a+" x "+i+" = "+a*i);
            System.out.println();
        }
    }
}