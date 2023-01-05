public class sortAndRotatedArray {
    public static void main(String args[]){

        int arr[]={5,6,7,8,9,0,1,2,3,4};
        System.out.println(sortArray(arr, 0, arr.length-1, 0));
    }

    public static int sortArray(int arr[], int si, int ei, int key){
        if(si>ei){
            return -1;
        }

        //finding mid
        int mid = si + (ei-si)/2;

        //found??
        if(arr[mid] == key){
            return mid;
        }

        //line one
    if(arr[si] <= arr[mid]){
            //left side
        if(arr[si] <= key && key <= arr[mid]){
            return sortArray(arr, si, mid-1, key);
        }
            //right side
        else{
            return sortArray(arr, mid+1, ei, key);
        }
    } 
        //line two
    else{
        //right side
        if(arr[mid] <= key && key <= arr[ei]){
            return sortArray(arr, mid+1, ei, key);
        }
        //left side
        else{
            return sortArray(arr, si, mid-1, key);
        }
    }
   

    }
}
