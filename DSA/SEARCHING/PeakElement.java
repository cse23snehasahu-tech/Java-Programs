package DSA.SEARCHING;

public class PeakElement {
    public static void main(String[] args) {
        int arr[]={10,20,30,25,15};
        int start=0, end=arr.length-1;

        while(start<end){
            int mid=(start+end)/2;

            if(arr[mid]<arr[mid+1]){
                start=mid+1;

            }
            else{
                end=mid;
            }
        }
        System.out.println("Peak element:"+arr[start]);
    }
    
}
