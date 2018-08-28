import java.util.Scanner;
public class factorial
{
    /*factorial using recursion*/
    static int fact(int x)
    {
        /*method for factorial*/
        if (x==0)
        {
            return 1;
        }
        else
        {
            return x*fact(x-1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("the factorial of the number is ");
        System.out.println(fact(num));
    }
}
