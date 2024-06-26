import java.util.Scanner;
class Q3{
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
        int flag=1;
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                if (a[i][j]!=a[j][i]){
                    flag=0;
                    break;
                }
            }
        }
        if (flag==1){
            System.out.println("Entered matrix is symmetric!");
        }
        else System.out.println("Entered matrix is not symmetric");
    }
}