// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
    	
    	double k = (double) N;

    	//Take log2 of n, and then floor of that. Then we get the highest position in the binary representation where there's a one.
    	//Ex. 5 = 101, log2(5) = 2.32..., floor(2.32) = 2, so bit 2 (counting from 0 and up) is the highest position of a one. 5 = 101.
    	//Ex. 32 = 100000, log2(32) = 5, floor(5) = 5. Seems to work out!

    	//When we know the highest position of a one, we subtract 2^position from the nr. For 5 we would get 5-4=1. We then take log2
    	//of that number and get the next position of a one. log2(1) = 0. We have a binary gap between bit 0 and bit 2. The length of
    	//the gap is 1. For longer nrs we just do this over and over until we get the nr to 0. 

    	int longestgap = 0;

    	while(k != 0) {
    		int top = (int) Math.floor(log2(k));						//Get the highest position of a one
    		int topval = (int) Math.pow(2,top);							//Get the value of that position (2^position)
    		if(k - topval == 0)											//If the value of this is 0 there are no more ones in the binary representation
    			break;
    		int bot = (int) Math.floor(log2(k-topval));					//Get the next position of a one
    		int newgap = top - (bot+1);									//Calculate the gap
    		longestgap = (longestgap < newgap) ? newgap : longestgap;	//Assign new longestgap if newgap is longer than longestgap
    		k = k - topval;												//Subtract the value of that position from k in order to calculate next gap
    	}

    	return longestgap;
        
    }

    private double log2 (double n) {
    	double d = Math.log(n)/Math.log(2);
    	//log_a(x) = log_b(x) / log_b (a)
    	return d;
    }


    //For testing
    public static void main (String[] args) {
    	Solution sol = new Solution();
    	for(String s : args) {
    		Integer n = Integer.parseInt(s);
    		System.out.println(sol.solution(n));
    	}
    }
}