import java.util.*;
class J{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,b,c=0;
        n=sc.nextInt();
        b=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if(a[i]%b==0){
                c++;
            }
        }
        System.out.println(c);
    }
}