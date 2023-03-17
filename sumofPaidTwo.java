import java.util.ArrayList;
public class sumofPaidTwo {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        //11, 15, 6, 8, 9, 10
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        //two pointers approach to find the sum of 2

        System.out.println(foundIt(list, 16));
    

    }

    public static boolean foundIt(ArrayList<Integer> list, int Target){
        int n= list.size();
        
        int brkinPnt=-1;

        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)> list.get(i+1)){
                brkinPnt= i;
            }
        }

        int lp=brkinPnt+1;
         int rp= brkinPnt;
         while(lp != rp){
            if((list.get(lp) + list.get(rp)) == Target){
                return true;
            }

            else if((list.get(lp) + list.get(rp)) > Target){
                rp= ((n+rp-1)%n);
            }
            else{
                lp= (lp + 1)% n;
            }
         }
         return false;
    }
}
