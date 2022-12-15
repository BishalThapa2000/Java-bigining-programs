import java.util.*;
public class trappedWater {
    public static int trapedWater(int hight[]){
        int n= hight.length;
        
        
        //calculate the max left boundery
        int leftmax[] = new int[n];
        leftmax[0]=hight[0];

        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(hight[i],leftmax[i-1]); //? i-1 ?
        }
    
        
        
        //calculate the max right boundery
        int rightmax[]= new int [n];
        rightmax[n-1]=hight[n-1];
        
        for(int i=n-2; i>=0; i--){
             rightmax[i] = Math.max(hight[i],rightmax[i+1]);
        }

        int trapedWater=0;
        //loop
        for(int i=0; i<n; i++){
            //water level
            int waterLevel = Math.min(leftmax[i],rightmax[i]);
            
            trapedWater += waterLevel - hight[i];

        }

        //trapped

        return trapedWater;
    }
    public static void main(String args[]){
        int hight[]={4,2,0,6,3,2,5};
        System.out.println(trapedWater(hight));
    }
}
