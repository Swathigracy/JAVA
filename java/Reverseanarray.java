package Array;

public class Reverseanarray {
    public static void main(String[] args) {
        int[] arr= {1,3,1,5,4,7,8,9,6};
        reverse(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
            
        }
    }
    static void reverse(int[] arr){
        int low = 0;
        int high = arr.length-1;
        //int a = arr[low];
        //int b = arr[high];
        while(low<high){
            int a = arr[low];
            int b = arr[high];
            int temp = arr[low];
            arr[low]= arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

    }
    
}
