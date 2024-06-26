import java.util.Scanner;
class Time{
    int h,m,s;
    void initializeZero(){
        h=0;
        m=0;
        s=0;
    }

    void initializeFixed(int hour, int min, int sec){
        h=hour;
        m=min;
        s=sec;
    }

    void display(){
        System.out.println(h+":"+m+":"+s);
    }

    Time add(Time t1, Time t2){
        Time t=new Time();
        t.h=t1.h+t2.h;
        t.m=t1.m+t2.m;
        t.s=t1.s+t2.s;
        if (t.s>=60){
            t.s=t.s-60;
            t.m++;
        }
        if (t.m>=60){
            t.m=t.m-60;
            t.h++;
        }
        if (t.h>=24){
            t.h=t.h-24;
        }
        return t;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Time t1=new Time();
        Time t2=new Time();
        Time t3=new Time();
        System.out.println("Enter time 1 and time 2 in hh:mm:ss format- ");
        int h1=sc.nextInt();
        int m1=sc.nextInt();
        int s1=sc.nextInt();
        int h2=sc.nextInt();
        int m2=sc.nextInt();
        int s2=sc.nextInt();
        t1.initializeFixed(h1,m1,s1);
        t2.initializeFixed(h2,m2,s2);
        t1.display();
        t2.display();
        //t3.initializeZero();
        t3=t1.add(t1,t2);
        System.out.println("Added time- ");
        t3.display();
    }
}
