/**
 * Created by MrWicki on 2017-07-28.
 */

import java.util.*;

public class Solution {
    public int solution(int[] A) {
        HashSet<Integer> seen = new HashSet();  //Create a set to hold all integers we've seen

        for(Integer i : A) {                    //Iterate through the array
            if(seen.contains(i)) {              //If we've seen the integer before we know that it's not a permutation
                return 0;                       //since if two numbers are the same at least one number that's needed is missing
            }
            else {
                seen.add(i);                    //Mark the integer as seen
            }
        }

        for(int i = 1; i < A.length+1; i++) {   //Check that we've seen all the numbers needed
            if(!seen.contains(i)) {             //If we're missing a number, return false
                return 0;
            }
        }

        return 1;                               //If we've seen all numbers it's a permutation
    }
}
