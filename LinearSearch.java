public class LinearSearch {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};

        int result=linearSearch(arr,5);

        if(result!=-1){
            System.out.println("Element is present at "+(result+1)+"th position");
        }else{
            System.out.println("Element is not present in array!");
        }
    }
    public static int linearSearch(int[] arr,int target){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }
}
