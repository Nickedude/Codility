// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        //Idea:	Sum up the array. Iterate through the array. For each element, calculate the sum up to that element, subtract it from the total sum
        //		to get the value of the top elements. Subtract top and bot in order to get the difference. If it's lower than the previous 
        //		difference, save it as the new minimum.

        //Time complexity:	Everything outside is just assignments which is O(1). First and second loops bodies are just arithmetic which is 
        //					just O(1). Both loops are iterating over all the elements so they are O(n). In total we get O(1 + n + n) = O(2n) = O(n)


    	int sum = 0;
        for(Integer i : A) {
        	sum = sum + i;				//Calculate the sum
        }

        int min = Integer.MAX_VALUE;	//Variable for holding the minimum
        int bot = 0;    				//Variable for holding the sum up to the current element

        for(int i = 0; i < A.length-1; i++){	//Iterate through the elements again, skip the last element
        	bot += A[i];						//Add the element to the sum up to here
        	int top = sum - bot;				//Calculate the tops value
        	int diff = Math.abs(top-bot);

        	if(diff < min)						//If the difference is a new minimum, save it
        		min = diff;
        }
        return min;
    }
}