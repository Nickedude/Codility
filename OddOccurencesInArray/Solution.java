// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] A) {
        //Idea: Iterate through the array starting from both the front and back. For every element, if it's in "seen"
        //		that means we've seen one occurence of it earlier. We have a pair! Remove it from the set so it can't
        //		be used again. If it's not in "seen" it's the first occurence of this element, add it to seen. 
        //		At the end, sum up all the elements in seen and return them.

    	//Time complexity: The init is clearly O(1). The loop's body contains only O(1) operations (contains in hash 
    	//				   set is O(1)) and the loop does n iterations so the complexity of the while loop is O(n).

    	//Space complexity: In the best case all the elements will be perfectly aligned and then the space of the hashet
    	//					will never be more than 1 element large. In worst case the elements will be ordered perfectly
    	//					unaligned, like this: 1 2 3 4 5 1 2 3 4 5. Since we start from the back and the fron the hashset will
    	//					contain {1,5,2,4,3} before it starts to shrink. Which is unfortunately O(n/2) = O(n). What to do?


    	//Init
        HashSet<Integer> seen = new HashSet<>();
        int l = A.length;
        int f = 0;
        int b = l-1;

        for(int i = 0; i < l; i++) {
        	if( i % 2 == 0) {
        		if(seen.contains(A[f]))
        		seen.remove(A[f]);
      
        		else
        			seen.add(A[f]);
        		f++;
        	}
        	else {
        		if(seen.contains(A[b]))
        			seen.remove(A[b]);
   
   	    	 	else
    	    		seen.add(A[b]);
        	   	b--;
        	}
        }

        int sum = 0;
        for(Integer i : seen) {
        	sum = sum + i;
        }

        return sum;
    }
}