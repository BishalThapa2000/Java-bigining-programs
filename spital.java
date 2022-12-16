public class spital {
    public static void spiral(int arr[][]){
        int start_row= 0;
        int start_col= 0;

        int end_row= arr.length-1;
        int end_col= arr[0].length-1;

        while(start_row <= end_row && start_col <= end_col){

            //1st top
            for(int j=start_col; j<=end_col; j++){
                
                System.out.print(arr[start_row][j]+" ");
            }
         
            //2nd right
            for(int i=start_row+1; i<=end_row; i++){
                
                System.out.print(arr[i][end_col]+" ");
            }
            //3nd bot
            for(int j=end_col-1; j>=start_col; j--){
                
                System.out.print(arr[end_row][j]+" ");
            }
            //4th left
            for(int i=end_row-1; i>=start_row+1; i--){
                
                System.out.print(arr[i][start_col]+" ");
            }

            start_col++;
            start_row++;
            end_col--;
            end_row--;
        }
    }
    public static void main(String args[]){
        int arr[][]= {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        spiral(arr);
    }
}
