import java.util.Scanner;
import java.io.*;
class n{
    public static void main(String [] args){
        int t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        int a[]=new int[20];
        int i,n,c2=0;
        for(i=0; i<t; i++){
            a[i]=s.nextInt();
            if (a[i]%2!=0){
                c2++;
            }
        }
        if(c2<3){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
            
        }
           
            
        }
    