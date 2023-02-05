import java.util.*;
class J{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==0){
            System.out.println("prime");
        }
        else{
             System.out.println("not a prime");
        }
    }
}