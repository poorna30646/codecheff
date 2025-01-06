import java.util.*;
import java.lang.*;
import java.io.*;
class ronaldo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=a*2+b;
        int f=c*2+d;
        if(e>f)
        {
            System.out.println("Messi");
        }
        else if(e==f)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Ronaldo");
        }
        
    }
}
