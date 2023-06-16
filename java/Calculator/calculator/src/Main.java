import java.util.Scanner;

public class Main {
    static void add(int x,int y)
    {
        int a = x + y ;
        System.out.println(+a);
    }

    static void sub(int x,int y) {
        int b = x - y;
        System.out.println(+b);


    }
    static void mul(int x, int y)
    {
        int c = x * y;
        System.out.println(+c);
    }
    static void div(int x, int y)
    {
        try {
            float c = x / y;
            System.out.println(+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        while (true) {
            System.out.println("Enter the 2 numbers");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("enter 1 for addition");
            System.out.println("enter 2 for subtraction");
            System.out.println("enter 3 for multiplication");
            System.out.println("enter 4 for division");
            System.out.println("enter 5 for exit");
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    add(x, y);
                    break;
                case 2:
                    sub(x, y);
                    break;
                case 3:
                    mul(x, y);
                    break;
                case 4:
                    div(x, y);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong input");
                    break;
            }

        }
    }
}