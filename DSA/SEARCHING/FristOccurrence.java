package DSA.SEARCHING;

public class FristOccurrence {
    public static void main(String[] args) {
        int arr[]={10,20,20,20,30,40};
        int key=20;

        int start =0, end=arr.length-1;
        int result=-1;

        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                result=mid;

                end=mid-1;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println("Frist Occurrence index:"+result);
    }
}