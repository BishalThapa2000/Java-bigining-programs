import java.util.ArrayList;
public class moistWater{
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        //1,8,6,2,5,4,8,3,7
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.print(waterStored(list));
        
    }

    public static int waterStored(ArrayList<Integer> list){
        
        // int max = Integer.MIN_VALUE;
        //  ***brute force****
        // for(int i=0; i<=list.size()-1; i++){
        //     for(int j= i+1; j<= list.size()-1; j++){
        //         int hight = Math.min(list.get(i), list.get(j));
        //         int width = j-i;

        //         int area= hight*width;

        //         if(max <= area ){
        //             max= area;
        //         }

        //     }
        // }


        //  ****two pointers approach****
        int max = Integer.MIN_VALUE;
        int lp= 0;
        int rp= list.size()-1;

        while(lp < rp){
            int hight = Math.min(list.get(lp), list.get(rp));
            int width = rp-lp;
            int area = hight*width;
            
            max = Math.max(max, area);

            if(list.get(lp)< list.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }


        return max;
    }
}