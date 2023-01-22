import javax.swing.border.Border;

public class nqueen {
    public static void main(String args[]){
        int n=4;
        char board[][] = new char[n][n];

        //initilizing
        for(int i= 0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='X';
            }
        }

        if(nQueen(board, 0)){
            System.out.print("The one solution is .\n");
            pirntArr(board);
        }
        else{
            System.out.print("solutuin so not exist\n");
        }
        // System.out.print("The Total Number of ways to solve is : "+count);
    }
    static int count= 0;
    public static boolean isSaffe(char board[][], int row, int col){

        
            for(int i= row-1; i>=0; i--){
                if(board[i][col]=='Q'){
                return false;
                }
            }
            //left dignol
            for(int i= row-1, j= col-1; i>=0 && j>=0; i--,j--){
                if(board[i][j]=='Q'){
                return false;
                }
            }
            
            
            //right dignol
            for(int i= row-1, j=col+1; i>=0 && j<board.length; i--,j++){
                if(board[i][j]=='Q'){
                return false;
                }
            }
        return true;
    
    }
    public static void pirntArr(char board[][]){
        for(int i= 0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.print("-------\n");
    }

    public static boolean nQueen(char board[][], int row){
        //base
        if(row==board.length){
            // pirntArr(board);
            // count++;
            return true;
        }
        //recusrsion and back track

        for(int i= 0; i<board.length; i++){

            if(isSaffe(board, row, i)){



                board[row][i]='Q';
                
                if(nQueen(board, row+1)){
                    return true;
                }
    
                board[row][i]='X';
                
            }
        }
        return false;
    }
}
