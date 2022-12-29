public class tileProble {
    public static void main(String args[]){
        // System.out.println(tileProblem(6));
        System.out.println(pairProb(4));
        binaryString(3, "", 0);

    }

    public static int tileProblem(int n){
        //base case
        if(n==1 || n==2){
            return 1;
        }

        //choices
        //vertical
        int nm1= tileProblem(n-1);
        //Horizontal
        int nm2= tileProblem(n-2);
        
        int totalWays= nm1 + nm2;

        return totalWays;

    }

    //PAIRING Problem
    public static int pairProb(int n){
        
        //base case
        if(n==1 || n==0){
            return 1;
        }
        //kam
        //Single choice
        int nm1= pairProb(n-1);
        
        //pair Choice
        int nm2 = pairProb(n-1) * pairProb(n-2);

        return nm1 +nm2;        
    }

    //binary String Problem
    public static void binaryString(int n, String str, int lastElemen){
        //base casse
        if(n==0){
            System.out.println(str);
            return;
        }

        //kaam
        binaryString(n-1, str+'0', 0);
        
        if(lastElemen==0){
            binaryString(n-1, str+'1', 1);         
        }

    }
}
