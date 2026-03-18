package DSA.SEARCHING;

public class BinarySearchSteps {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int key=30;
        int start=0, end=arr.length-1;
        int steps=0;

        while (start<=end) {
            steps++;
            int mid=(start+end)/2;

            if(arr[mid]==key){
                System.out.println("Found at index:"+mid);
                System.out.println("Steps taken:"+steps);
                
                return;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
            System.out.println("Not found");
        }
    }
    
}
