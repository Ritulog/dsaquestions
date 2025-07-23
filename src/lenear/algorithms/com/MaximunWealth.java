package lenear.algorithms.com;

//Ques. You are given an mXn integer grid account where account[i][j] is the amount of money
      // the ith customer has in the jth bank Return the wealth that the richest customer has.
      // A customer's wealth is the amount of money they have in all their bank accounts.the
//       richest customer is the customer that has the maximum wealth
// accounts =[[1,5],[7,3],[3,5]]
// first customer has wealth 1+5 =6
// second customer wealth is 7+3=10
// third customer wealth 3+5=8
//ans= second customer

public class MaximunWealth {
    public static void main(String[] args) {
        int[][] arr={
                {2,9,1},
                {1,0,4},
                {2,4,3},

        };

        System.out.println(maxWealth(arr));
    }
     static int maxWealth(int[][] accounts){
        //person = row
        // account= col
        int ans = Integer.MIN_VALUE;
        for(int person=0; person<accounts.length; person++){
            // when you start a new col, take a new sum for that row
            int sum=0;
            for(int account =0; account<accounts[person].length; account++){
                sum +=accounts[person][account];
            }
            //now we have sum of accounts of person
            //check with overall ans
            if(sum>ans){
                ans= sum;
            }
        }
        return  ans;
    }
}
