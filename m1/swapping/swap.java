public class swap
{
  public static void main(String[] args)
  {
    int a = 5;
    int b = 6;
    int temp;
    System.out.println(a);
    System.out.println(b);
    temp = a;
    a = b;
    b = temp;
    System.out.println("after swapping"+a+b);
  }
}