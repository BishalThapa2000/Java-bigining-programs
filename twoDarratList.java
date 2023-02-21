import java.util.ArrayList;
public class twoDarratList {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();

        //lists
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> lis2 = new ArrayList<>();
        ArrayList<Integer> lis3 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            list1.add(i*1);//1 2 3 4 5
            lis2.add(i*2);//2 4 6 8 10
            lis3.add(i*3);//3 6 9 12 15
        }
        mainList.add(list1);
        mainList.add(lis2);
        mainList.add(lis3);
        System.out.print(mainList);
        
        System.out.println();

        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j< currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
