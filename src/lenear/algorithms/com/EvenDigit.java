package lenear.algorithms.com;

public class EvenDigit {
    public static void main(String[] args) {
        //Q. given an array num of integers, return how many of them contain an
        // even numbers of digits.
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumber(nums));
        System.out.println(digits(0));
        System.out.println(digit2(0));


    }
    static int  findNumber(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not
   static boolean even(int num) {
        int  numberOfDigits= digits(num);
//        if(numberOfDigits % 2==0){
//            return false;
//        }
//        return false;
       return numberOfDigits % 2==0;
    }

    //count number of digits in a number
    static int digits(int num){
        //if number less than 0
        if(num <0){
            num = num *-1;
        }
        //if number equal=0
        if(num==0){
            return 1;
        }
        int count =0;
        while (num>0){
            count++;
            num=num/10; // num /=10;
        }
        return count;
    }

    static int digit2(int num){
        //if number less than 0
        if(num <0){
            num = num *-1;
        }
        //if number equal=0
        if(num==0){
            return 1;
        }
        return (int)(Math.log10(num)+1);
    }

}
