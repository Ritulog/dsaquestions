package lenear.algorithms.com;

public class SearchInRange {
    public static void main(String[] args) {
        //Search for 3 in the range if index[1,4]

        int[] arr = {18, 12, 9, 14, 77, 50, 2, 8, 19, -3, -11, 20};
        int target = 92;
        int start=0;
        int end=3;
        int ans = linearSearch(arr, target, start,end);
        System.out.println(ans);


    }
    //search in array: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return  -1;
        }
        //run a for loop
        for(int index=start; index<end; index++){
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
}

