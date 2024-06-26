import java.util.Scanner;
class Q4{
    public static void main(String args[]){
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows in first matrix: ");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns in first matrix: ");
        n=sc.nextInt();
        int a[][]=new int[m][n];
        
        System.out.println("Enter the elements of the first matrix: ");
        for (i=0;i<m;i++){
            for (j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows in second matrix: ");
        int p=sc.nextInt();
        System.out.println("Enter the number of columns in second matrix: ");
        int q=sc.nextInt();
        int b[][]=new int[p][q];

        System.out.println("Enter the elements of the second matrix: ");
        for (i=0;i<p;i++){
            for (j=0;j<q;j++){
                b[i][j]=sc.nextInt();
            }
        }
        
        if (m==p && n==q){
            int c[][]=new int[m][n];
            for (i=0;i<m;i++){
                for (j=0;j<n;j++){
                    c[i][j]=a[i][j]+b[i][j];
                }
            }
            System.out.println("Addition of input matrices: ");
            for (i=0;i<m;i++){
                for (j=0;j<n;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Addition operation cannot be performed!");
        }

        if (n==p){
            int d[][]=new int[m][q];
            for (i=0;i<m;i++){
                for (j=0;j<q;j++){
                    d[i][j]=0;
                    for (int k=0;k<n;k++){
                        d[i][j]+=(a[i][k]+b[k][j]);
                    }
                }
            }

            System.out.println("Multiplication of input matrices: ");
            for (i=0;i<m;i++){
                for (j=0;j<q;j++){
                    System.out.print(d[i][j]+" ");
                }
                System.out.println();
            }
        }
        else System.out.println("Multiplication operation cannot be performed!");
    }
}