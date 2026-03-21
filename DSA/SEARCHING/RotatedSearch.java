package DSA.SEARCHING;
public class RotatedSearch {
    public static void main(String[] args) {

        int arr[] = {30, 40, 50, 10, 20};
        int key = 10;

        int start = 0, end = arr.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == key){
                System.out.println("Element found at index: " + mid);
                return;
            }

            // Left part sorted
            if(arr[start] <= arr[mid]){
                if(key >= arr[start] && key < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Right part sorted
            else{
                if(key > arr[mid] && key <= arr[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        System.out.println("Element not found");
    }
}