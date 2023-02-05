import java.util.*;
class J{
    public static boolean prime(int n){
        for(int j=2;j<=(int)Math.sqrt(n);j++){
            if(n%j==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,c=0;
        a=s.nextInt();
        for(int i=2;i<a;i++){
            if(prime(i)){
            for(int j=i+1;j<=a;j++){
                if(prime(j))
                {
                    if(i*j==a){
                        c=1;
                        System.out.println(i+" "+j);
                    }
                }
            }
         }
        }
        if(c==0){
            System.out.println("-1");
        }
    }
}