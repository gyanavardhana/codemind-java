import java.util.Scanner;
class n{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        char k=s.next().charAt(0);
        if (k=='v' || k=='V'){
            System.out.println("Violet");
        }
        else if (k=='i' || k=='I'){
            System.out.println("Indigo");
        }
        else if (k=='b' || k=='b'){
            System.out.println("Blue");
        }
        else if (k=='g' || k=='G'){
            System.out.println("Green");
        }
        else if (k=='y' || k=='Y'){
            System.out.println("Yellow");
        }
        else if (k=='o' || k=='O'){
            System.out.println("Orange");
        }
        else if (k=='r' || k=='R'){
            System.out.println("Red");
        }else{
            System.out.println(-1);
        }
    }
}