public class BinarySearch {

    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        int result= binarySearch(arr,0);

        if(result!=-1){
            System.out.println("Element found at "+(result+1)+"th position");
        }else{
            System.out.println("Element not found!!");
        }
    }
    public static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid= start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (target<arr[mid]) {
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }
        }


        return -1;
    }
}
