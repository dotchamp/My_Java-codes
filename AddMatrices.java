import java.util.Scanner;
public class AddMatrices {
    public static void takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int row = sc.nextInt();
         System.out.println("enter number of columns: ");
        int columns = sc.nextInt();
        int[][] b = new int[row][columns];
        int[][] c= new int [row][columns];
        int[][] sum = new int[row][columns];
        System.out.println("enter values for first matrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<columns; j++){
                 b[i][j] = sc.nextInt();
            }
        }

         System.out.println("enter values for second matrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<columns; j++){
                 c[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<columns; j++){
                 sum[i][j] = c[i][j] + b[i][j];
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<columns; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
            sc.close();
        }
        
    }
    public static void main(String[] args) {
        takeInput();
    }
}
