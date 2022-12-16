public class staircase {
    public static boolean staircase(int arr[][],int key){
        int row=0, col= arr[0].length-1;

        while( row<=arr.length && col>=0){

            if(key== arr[row][col]){

                System.out.print("We found the key YippY ("+ row+","+col+")");
                return true;
            }
            else if(key < arr[row][col]){
                col--;
            }
            else if(key > arr[row][col]){
                row++;
            }
        }
        System.out.print(" Sad Do not Found any such number :(");
        return false;
    }
    public static void main(String args[]){
        int key=33;
        int arr[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50},
        };
        staircase(arr, key);
    }
}
