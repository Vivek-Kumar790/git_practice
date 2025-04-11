import java.util.*;
class calci{

    public static int addTwoNumber(int a,int b)
    {
        return a+b;
    }
    public static int subtractTwoNumber(int a,int b)
    {
        return a-b;
    }
    public static void main(String arg[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("press 1 for addition 2 for subraction");
        int choice = sc.nextInt();
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch(choice) {
            case 1 : System.out.println(addTwoNumber(a,b));
            break;
            case 2 : System.out.println(subtractTwoNumber(a,b));
            break;
        }
        
       

    }
}