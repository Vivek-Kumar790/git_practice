import java.util.*;
class calci{

    public static int addTwoNumber(int a,int b)
    {
        return a+b;
    }
    public static void main(String arg[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
       System.out.println(addTwoNumber(a,b));

    }
}