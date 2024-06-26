import java.util.Scanner;
class Employee{
    Scanner sc=new Scanner(System.in);
    String name,city;
    double bs,da,hra,total;
    void getdata(){
        name=sc.nextLine();
        city=sc.nextLine();
        bs=sc.nextDouble();
        da=sc.nextDouble();
        hra=sc.nextDouble();
    }

    void calculate(){
        total=bs+((bs*da)/100)+((bs*hra)/100);
    }

    void display(){
        System.out.println("Total: "+total);
    }
}

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter employee name, city, basic salary, dearness allowance and house rent allowance in percentage: ");
        Employee e=new Employee();
        e.getdata();
        e.calculate();
        e.display();
    }
}
