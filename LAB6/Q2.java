import java.util.Scanner;
public class Q2 {
    public static void main(String args[]){
        Student s=new Student(230953427, "fresher", 18);
        s.info();
        UG ug=new UG(220911350, "yash", 19, 3, 250000);
        ug.info();
    }
}

class Student{
    int regno;
    int age;
    String name;
    Student(int reg, String n, int a){
        regno=reg;
        age=a;
        name=n;
    }
    void info(){
        System.out.println("Information about student: ");
        System.out.println("Reg. no. : "+regno);
        System.out.println("Name : "+name);
        System.out.println("Age : "+regno);
    }
}

class UG extends Student{
    int sem;
    float fees;
    UG(int reg, String n, int a, int s, float f){
        super(reg,n,a);
        sem=s;
        fees=f;
    }
    void info(){
        System.out.println("Information about student: ");
        System.out.println("Reg. no. : "+regno);
        System.out.println("Name : "+name);
        System.out.println("Age : "+regno);
        System.out.println("Semester : "+sem);
        System.out.println("Fees : "+fees);
    }
}

class PG extends Student{
    int sem;
    float fees;
    PG(int reg, String n, int a, int s, float f){
        super(reg,n,a);
        sem=s;
        fees=f;
    }
    void info(){
        System.out.println("Information about student: ");
        System.out.println("Reg. no. : "+regno);
        System.out.println("Name : "+name);
        System.out.println("Age : "+regno);
        System.out.println("Semester : "+sem);
        System.out.println("Fees : "+fees);
    }
}