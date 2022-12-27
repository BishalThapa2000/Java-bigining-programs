public class occorenceRecursion {
    public static void  main(String args[]){
        int n[]= {5,6,2,5,6,2,4,6,2,7,9,5,3};
        // System.out.println(firstOccur(n, 7, 0));
        // System.out.println(powerOf(2,5));
        System.out.println(powOf(2,5));

    }

    //first occurence
    public static int firstOccur(int n[],int key, int i){
    if(key==n[i]){
        return i;
    }    
    if(i>=n.length){
        return -1;
    }

    return firstOccur(n, key, i+1);

    }
    //last occurence
    public static int lastOccurence(int n[],int key,int i){
        
        if(i==n.length){
            return -1;
        }
        int isFound= lastOccurence(n, key, i+1);
        if(isFound!= -1){
            return isFound;
        }

        //check within
        if(n[i]==key){
            return i;
        }
        return isFound;

    }
//powe with recursion (n* powOf(n, pow-1))    --> O(n)
    public static int powerOf(int n, int pow){
        if(pow==0){
            return 1;
        }
        
        return n * powerOf(n, pow-1);
    }

    //pwr with recursion ( a*(n/2 * n/2))    --> O(log2 n)
    public static int powOf(int n, int pow){

        if(pow==0){
            return 1;
        }
        int powHalf= powOf(n, pow/2);
        int powHalfSqr= powHalf * powHalf;
        
        //odd
        if(pow%2!=0){
            return powHalfSqr*n;
        }

        return powHalfSqr;
    }



}
