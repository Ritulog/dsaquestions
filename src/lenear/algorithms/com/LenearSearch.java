package lenear.algorithms.com;

public class LenearSearch {
    public static void main(String[] args) {
        // Ques.find  wheather 14 exits in array or not and value not find return -1

        int[] arr={18,12,9,14,77,50,2,8,19,-3,-11,20};
        int target=9;
        int ans=linearSearch(arr, target);
        int ans2=linearSearch2(arr,target);
        boolean ans3=linearSearch3(arr, target);
        System.out.println(ans+" "+ans2+" "+ans3);

    }
    //search in array: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return  -1;
        }
        //run a for loop
        for(int index=0; index< arr.length; index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        // this line will execute if none of the return statement above have executed
        //hence target is not found.
        return   -1;
    }


    //search in array: return the element if item found
    //otherwise if item not found return -1
    static int linearSearch2(int[] arr, int target){
        if(arr.length==0){
            return  -1;
        }
        //run a for loop
        for (int element : arr) {
            //check for element at every index if it is = target
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statement above have executed
        //hence target is not found.
        return   Integer.MAX_VALUE;
    }

    // search the target and return the true or false
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length==0){
            return  false;
        }
        //run a for loop
        for(int index=0; index< arr.length; index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(element==target){
                return true;
            }
        }
        // this line will execute if none of the return statement above have executed
        //hence target is not found.
        return false;
    }


}
