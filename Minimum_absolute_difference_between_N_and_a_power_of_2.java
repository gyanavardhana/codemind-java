import java.util.*;
class J{
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    int n,i,j,min=0,max=0,p;
    n=s.nextInt();
    for(i=1;i<n;i++)
    {
        if(n>=(int)Math.pow(2,i))
        {
            min=i;
        }
        if(n<(int)Math.pow(2,i))
        {
            max=i;
            break;
        }
    }
    if(n-(int)Math.pow(2,min)<=((int)Math.pow(2,max)-n))
    {
        p=n-(int)Math.pow(2,min);
        System.out.println(p);
    }
    else
    {
        p=(int)Math.pow(2,max)-n;
        System.out.println(p);
    }
}
}