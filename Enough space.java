import java.util.*;
import java.lang.*;
class fire
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=b+c*2;
            if(d<=a)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
    }
}
