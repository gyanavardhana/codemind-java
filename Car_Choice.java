import java.util.Scanner;
class n{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        while(n!=0){
        double x1=s.nextDouble();
        double x2=s.nextDouble();
        double y1=s.nextDouble();
        double y2=s.nextDouble();  
        double k=(x1/y1);
        double j=(x2/y2);
        if (k>j){
            System.out.println(-1);
        }else if(j>k){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        n=n-1;
        }
    }
}