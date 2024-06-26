import java.util.Scanner;
class Operations{
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    int n;
    void input(){
        System.out.println("Enter number of input elements: ");
        n=sc.nextInt();
        System.out.println("Enter the elements: ");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    }
    void display(){
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    void largest(){
        int l=a[0];
        for (int i=0;i<n;i++){
            if (a[i]>l){
                l=a[i];
            }
        }
        System.out.println("Largest: "+l);
    }
    void average(){
        int sum=0;
        double avg;
        for (int i=0;i<n;i++){
            sum+=a[i];
        }
        avg=(double)sum/(double)n;
        System.out.println("Average: "+avg);
    }
    void sort(){
        int temp;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        System.out.println("Sorted array: ");
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Operations op=new Operations();
        op.input();
        op.display();
        op.largest();
        op.average();
        op.sort();
    }
}
