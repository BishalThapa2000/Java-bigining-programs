public class gridWays {
    public static void main(String args[]){
        int n= 4, m= 5;

        System.out.print(gridWays(0,0, n, m));

    }

    public static int gridWays(int i, int j, int n, int m){
        //base case
        if(i== n-1 || j==m-1){
            return 1;
        }
        else if(i == n || j==m){
            return 0;
        }

        //recurtion
        int down = gridWays(i+1, j, n, m);
        int left = gridWays(i, j+1, n, m);

        return down+ left;
    }
}
