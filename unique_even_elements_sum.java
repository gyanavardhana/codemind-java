import java.util.*;
class J{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,s=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int c=0;
            if(a[i]==-999){
                continue;
                }
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    c=1;
                    a[j]=-999;
                }
            }
            if(a[i]%2==0){
                s+=a[i];
            }
        }
        System.out.println(s);
    }
}