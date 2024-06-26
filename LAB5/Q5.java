import java.util.Scanner;
class Number{
    double n;
    Number(int n1){
        n=n1;
    }
    boolean isZero(){
        return n==0;
    }
    boolean isPositive(){
        return n>0;
    }
    boolean isNegative(){
        return n<0;
    }
    boolean isOdd(){
        return n%2 !=0;
    }
    boolean isEven(){
        return n%2 ==0;
    }
    boolean isPrime(){
        int c=0,i;
        for (i=1;i<=n;i++){
            if (n%i==0){
                c++;
            }
        }
        return c==2;
    }
    boolean isArmstrong(){
        int rem;
        double num;
        double sum=0;
        num=n;
        while(n>0){
            rem=n%10;
            sum+=rem*rem*rem;
            n=n/10;
        }
        return sum==num;
    }
    
}

public class Q5 {
    public static void main(String[] args) {
        int n1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n1=sc.nextInt();
        Number num=new Number(n1);
        num
    }
}
