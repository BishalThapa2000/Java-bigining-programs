public class quickShort {
    public static void main(String args[]){
        int arr[]={2,5,1,8,3,4,9,6,7};
        quickShort(arr, 0, arr.length-1);
        printFun(arr);
    }
    public static void printFun(int arr[]){
        for(int i=0; i<=arr.length-1; i++){

            System.out.print(arr[i]+" ");
        }
    }

    public static void quickShort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        //pivot
        int pIdx= partition(arr, si, ei);
        quickShort(arr, si, pIdx-1);
        quickShort(arr, pIdx+1, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot= arr[ei];
        int i= si-1;
        
        for(int j=si; j<ei; j++){
            if(arr[j]<=pivot){
                i++;

                //swap
                int temp= arr[j];
                arr[j]= arr[i];
                arr[i]=temp;

            }
        }
        i++;
        int temp= pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
}
