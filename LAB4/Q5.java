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
        int x=0;
        int flag=1;
        for (i=0;i<n;i++){
            j=0;
            x+=a[i][j];
        }
        int rowsum=0,colsum=0;
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                rowsum+=a[i][j];
                colsum+=a[j][i];
            }
            if ((rowsum!=x) || (colsum!=x)){
                flag=0;
                break;
            }
            rowsum=0;
            colsum=0;
        }
        
        int diagsum1=0, diagsum2=0;
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                if (i==j){
                    diagsum1+=a[i][j];
                }
            }
        }
        if (diagsum1!=x){
            flag=0;
        }
        
        j=n-1;
        i=0;
        
        while(j>=0 && i!=n){
            diagsum2+=a[i][j];
            j--;
            i++;
        }
        if (diagsum2!=x){
            flag=0;
        }
        if (flag==1){
            System.out.println("Entered matrix is magic square!");
        }
        else if (flag==0){
            System.out.println("Entered matrix is not magic square");
        }
    }
}