import java.util.Scanner;
class Q7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j,n,m;
        System.out.println("Enter number of elements in first array: ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements: ");
        for (i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter number of elements in second array: ");
        m=sc.nextInt();
        int b[]=new int[m];
        System.out.println("Enter the elements: ");
        for (i=0;i<m;i++){
            b[i]=sc.nextInt();
        }

        int c[]=new int[m+n];
        for (i=0;i<m;i++){
            c[i]=a[i];
        }
        int k=0;
        for (i=m;i<m+n;i++){
            c[i]=b[k];
            k++;
        }
        System.out.println("Merged array: ");
        for (i=0;i<m+n;i++){
            System.out.println(c[i]+" ");
        }
        int temp;
        for (i=0;i<m+n-1;i++){
            for (j=0;j<m+n-i-1;j++){
                if (c[j]>c[j+1]){
                    temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for (i=0;i<m+n;i++){
            System.out.println(c[i]+" ");
        }
    }
}