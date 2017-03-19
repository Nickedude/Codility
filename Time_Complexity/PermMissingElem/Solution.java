// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        //Length of array is n. The nrs are in the range from 0 to n+1. The sum of all these numbers are (n+1)*((n+1)+1)/2
        //If we subtract all the nrs in the array from this sum we'll get the one missing
        int n = A.length;
        int sum = (n+1)*(n+1+1)/2;

        for(int i = 0; i < n; i++) {
        	sum = sum - A[i];
        }

        return sum;
    }
}