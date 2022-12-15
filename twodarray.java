import java.util.*;
public class twodarray {
    
    public static void main(String args[]){
        int key =10;
         int matrix [][] = new int [3][3];
         int n = matrix.length, m= matrix[0].length;

         Scanner sc= new Scanner(System.in);

         for( int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        
        //output
        for( int i= 0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");  
            }
            System.out.println();
         }
         search(matrix, key);
         System.out.println();
         minmax(matrix);
         
    }
    
    public static boolean search(int matrix[][], int key){
        
        for(int i= 0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if (matrix[i][j]==key){
                    System.out.print("Found that the cell "+ i+" "+j);
                    return true;
                }
            }
            
        }
        System.out.print("The Largest of them is :");

        
        System.out.print("Cell do not exist");
        return false;
    }
    
    public static int minmax(int matrix[][]){  
        int largest= Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;
        int key =10;
        
         for( int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                 // largest and smallest numbers
                 if(largest< matrix[i][j]){
                    largest= matrix[i][j];
                    return largest;
                }
                if(smallest > matrix[i][j]){
                    smallest= matrix[i][j];
                    
                    return smallest;
                }
                
            }
        }
        return 0;
    }
}
