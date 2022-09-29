import java.util.Scanner;
class n{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n,k;
        n=s.nextInt();
        k=(n*(n-1))/2;
        System.out.println(k);
    }
}