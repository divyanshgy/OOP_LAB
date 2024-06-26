import java.util.Scanner;
class Q2{
    public static void main(String args[]){
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of the matrix: ");
        n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter the elements of the matrix: ");
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                if (i==j){
                    System.out.println(a[i][j]+" ");
                    sum+=a[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Sum is: "+sum);
    }
}