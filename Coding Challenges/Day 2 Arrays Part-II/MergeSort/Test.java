import java.util.ArrayList;

class Test{
// Problem:  Given an array of size n, sort the array using
// Merge Sort.
public static void merge(int[] nums, int low, int mid, int high){
    ArrayList<Integer> temp = new ArrayList<>();
    int left=0;
    int right=mid+1;
    // storing elements in the temporary array in sorted form
    while (left<=mid && right<=high) {
        if(nums[left]<=nums[right]){
            temp.add(nums[left]);
            left++;
        }
        else{
            temp.add(nums[right]);
            right++;
        }
    }
    while(left<=mid){
        temp.add(nums[left]);
        left++;
    }
    while (right<=high) {
        temp.add(nums[right]);
    }
    for(int i=low;i<=high;i++){
        nums[i]=temp.get(i-low);
    }
}


// Merge sort function
private static void mergeSort(int[] nums, int low, int high){
    if(low>=high){
        return;
    }
    int mid=(low+high)/2;
    mergeSort(nums,low,mid);
    mergeSort(nums,mid+1,high);
    merge(nums,low,mid,high);
}
//Main Function
public static void main(String[] args) {
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeSort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
}   
}