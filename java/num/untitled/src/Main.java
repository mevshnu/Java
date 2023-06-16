import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.println("enter the number");
            System.out.println(" enter 1 to find largest number among 3 ");
            System.out.println(" enter 2 to find smallest number among 3");
            System.out.println(" enter 3 to find the number is prime or not");
            System.out.println(" enter 4 to find the number is even or not ");
            System.out.println(" enter 5 to reverse a number");
            System.out.println(" enter 6 to exit");
            Scanner sc = new Scanner(System.in);
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    largest();
                    break;
                case 2:
                    smallest();
                    break;
                case 3:
                    prime();
                    break;
                case 4:
                    oddeven();
                    break;
                case 5:
                    reverse();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong input");
                    break;

            }
        }
    }

    static void largest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 number");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x > y && x > z) {
            System.out.println("largest number is" + x);
        }
        if (y > z && y > x) {
            System.out.println("largest number is" + y);
        }
        if (z > y && z > x) {
            System.out.println("largest number is" + y);
        }

    }

    static void smallest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 number");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x > y && x > z) {
            System.out.println("smallest number is" + x);
        }
        if (y > z && y > x) {
            System.out.println("smallest number is" + y);
        }
        if (z > y && z > x) {
            System.out.println("smallest number is" + y);
        }


    }

    static void prime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        int i;
        int flag = 0;
        if(x==0||x==1)
        {
            System.out.println(x+" is not prime number");
        }
        else {
            for (i = 2; i < x; i++) {
                if (x % i == 0) {
                    System.out.println(x + " is not prime number");
                    flag = 1;
                    break;
                }
            }
        }
        if(flag==0)
        {
            System.out.println(x+" is prime number");
        }

    }
    static void oddeven()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        if(x%2==0)
        {
            System.out.println("even number");
        }
            else
        {
            System.out.println("odd number");
        }
    }
    static void reverse()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        int reversee=0;
        while (x != 0)
        {
             int remainder = x % 10;
             reversee = reversee * 10 + remainder;
            x =x/10;
        }

        System.out.println("Reversed number = "+ reversee);

    }

}