import java.util.Scanner;
class Q6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter number of elements in array: ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements: ");
        for (i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int largest, smallest;
        int l=a[0];
        for (i=1;i<n;i++){
            if (a[i]>l){
                l=a[i];
            }
        }
        largest=l;
        int s=a[0];
        for (i=1;i<n;i++){
            if (a[i]<s){
                s=a[i];
            }
        }
        smallest=s;
        System.out.println("The largest and smallest integers respectively: "+largest+" "+smallest);
    }
}