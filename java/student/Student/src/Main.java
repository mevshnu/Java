import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> studentlist = new ArrayList<Student>();
    //ArrayList<Student> studentlist = new ArrayList<>();

    public static void main(String[] args)
    {
        while(true) {
            System.out.println("enter 1 to add data");
            System.out.println("enter 2 to view data");
            System.out.println("enter 3 to search data");
            System.out.println("enter 4 to delete data\n" +
                    "enter 5 to exit");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    add();
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
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
    static void add()
    {
        System.out.println("Enter name");
        String name=sc.next();
        System.out.println("Enter admission no");
        int admissionNo = sc.nextInt();
        System.out.println("Enter roll no");
        int rollNo = sc.nextInt();
        System.out.println("Enter college name");
        String college = sc.next();
        Student st = new Student(name,admissionNo,rollNo,college);
        studentlist.add(st);
        System.out.println("student added");
    }
    static void view()
    {
        for(int i=0;i< studentlist.size();i++)
        {
            System.out.println("Name: "+studentlist.get(i).name);
            System.out.println("admission no:"+studentlist.get(i).admissionNo);
            System.out.println("roll no "+studentlist.get(i).rollNo);
            System.out.println("collage name"+studentlist.get(i).college);
        }
    }
    static void search()
    {
    System.out.println("enter admission number");
    int u = sc.nextInt();
    int flag =0;
        for(int i=0;i< studentlist.size();i++)
        {
            if(u == studentlist.get(i).admissionNo)
            {
                System.out.println("Name: "+studentlist.get(i).name);
                System.out.println("admission no:"+studentlist.get(i).admissionNo);
                System.out.println("roll no "+studentlist.get(i).rollNo);
                System.out.println("collage name"+studentlist.get(i).college);
                flag=1;
            }

        }
        if (flag==0)
        {
            System.out.println("not found");
        }
    }
    static void delete()
    {
        System.out.println("enter admission number");
        int u = sc.nextInt();
        for(int i=0;i< studentlist.size();i++) {
            if (u == studentlist.get(i).admissionNo)
            {
            studentlist.remove(i);
                System.out.println("Student removed");
                break;
            }
        }
    }
}
class Student
{
    String name;
    int admissionNo;
    int rollNo;
    String college;

    public Student(String name, int admissionNo, int rollNo, String college)
    {
        this.name = name;
        this.admissionNo = admissionNo;
        this.rollNo = rollNo;
        this.college = college;
    }
}