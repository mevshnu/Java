import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static ArrayList<ArrayList> user = new ArrayList<ArrayList>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        while (true) {
            System.out.println("press 1 to add data");
            System.out.println("press 2 to view data");
            System.out.println("press 3 to search data");
            System.out.println("press 4 to delete data");
            System.out.println("press 5 to exit");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    addemployee();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    delete();
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
    static void addemployee()
    {
        ArrayList<Object> a1 = new ArrayList<Object>();
        System.out.println("enter employee code :");
        Scanner sc = new Scanner(System.in);
        int code =sc.nextInt();
        System.out.println("enter employee name :");
        String name=sc.next();
        System.out.println("enter employee designation :");
        String designation=sc.next();
        System.out.println("enter salary :");
        int salary = sc.nextInt();
        System.out.println("enter company name :");
        String company=sc.next();
        System.out.println("enter phone number :");
        long phonenumber = sc.nextLong();
        System.out.println("email :");
        String email=sc.next();
        a1.add(code);
        a1.add(name);
        a1.add(designation);
        a1.add(salary);
        a1.add(company);
        a1.add(phonenumber);
        a1.add(email);
        user.add(a1);
        System.out.println("employee added");
    }
static void view()
{
    for(int i=0;i<user.size();i++)
    {
        System.out.println("employee code " + user.get(i).get(0));
        System.out.println("employee name " + user.get(i).get(1));
        System.out.println("employee designation " + user.get(i).get(2));
        System.out.println("employee salary " + user.get(i).get(3));
        System.out.println("employee company name " + user.get(i).get(4));
        System.out.println("employee phone number " + user.get(i).get(5));
        System.out.println("employee email" + user.get(i).get(6));
    }
}
static void search()
{
    System.out.println("enter the employee code");

        int o = sc.nextInt();
        int flag = 0;
        for(int i=0;i<user.size();i++)
        {
            if((user.get(i).get(0)).equals(o))
            {
                System.out.println("employee Found");
                System.out.println("employee code " + user.get(i).get(0));
                System.out.println("employee name " + user.get(i).get(1));
                System.out.println("employee designation " + user.get(i).get(2));
                System.out.println("employee salary " + user.get(i).get(3));
                System.out.println("employee company name " + user.get(i).get(4));
                System.out.println("employee phone number " + user.get(i).get(5));
                System.out.println("employee email" + user.get(i).get(6));
                flag = 1;
            }
        }
        if(flag==0)
        {
            System.out.println("employee not found");
        }
}
static void delete()
{
    System.out.println("enter the employee code");
    int o = sc.nextInt();
    for(int i=0;i<= user.size();i++)
    {
        if((user.get(i).get(0).equals(o)))
        {
        user.remove(i);
        System.out.println("user removed Sucessfully");
        }
    }
}
}

