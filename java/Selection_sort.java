package Sorting;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {20,12,10,15,2};
        sort(arr);
        for(Integer i: arr){
            System.out.print(i+" ");
        }
        
    }

    static void sort(int[] arr){
        for(int i=0; i<arr.length;i++){
            int miniIndex=i;
            for(int j=i; j<arr.length ; j++){
                if(arr[j]< arr[miniIndex]){
                    miniIndex = j;
                }


            }
            int temp = arr[i];
            arr[i] = arr[miniIndex];
            arr[miniIndex] = temp;

        }
    
    
    }
}
