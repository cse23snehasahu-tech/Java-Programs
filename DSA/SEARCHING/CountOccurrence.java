package DSA.SEARCHING;
public class CountOccurrence {
    public static void main(String[] args) {

        int arr[] = {10, 20, 20, 20, 30, 40};
        int key = 20;

        int first = firstOccurrence(arr, key);
        int last = lastOccurrence(arr, key);

        if(first == -1){
            System.out.println("Element not found");
        } else {
            int count = last - first + 1;
            System.out.println("Count: " + count);
        }
    }

    public static int firstOccurrence(int arr[], int key){
        int start = 0, end = arr.length - 1;
        int result = -1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == key){
                result = mid;
                end = mid - 1;
            }
            else if(arr[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return result;
    }

    public static int lastOccurrence(int arr[], int key){
        int start = 0, end = arr.length - 1;
        int result = -1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == key){
                result = mid;
                start = mid + 1;
            }
            else if(arr[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return result;
    }
}
