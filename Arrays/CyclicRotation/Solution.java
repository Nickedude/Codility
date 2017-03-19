// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        int l = A.length;

        if (l == 0) {           //Handle the case of an empty array
            return A;
        }

        int k = K % l;			//If the length of the array is 5 and we're supposed to do 5 rotations to the right that 
        						//would be the same as doing no rotations. 5 % 5 = 0, so this operations gives us the nr of necessary rotations.

        int[] b = new int[l]; 

        for(int i = 0; i < l; i++) {
        	int ni = (i+k) % l; 		//The i is the old index and ni the new index (after rotation). i+k gives new index, use mod to get it within range.
        								//Say k = 1. That means that element at index l-1 will have ni = l-1+1 = l, and l mod l is 0. 
        	b[ni] = A[i];				//Move the element.
        }

        return b;
    }
}