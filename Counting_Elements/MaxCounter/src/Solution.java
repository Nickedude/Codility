/**
 * Created by MrWicki on 2017-07-28.
 */

import java.util.*;

public class Solution {
    public int[] solution(int N, int[] A) {
        //N is the number of counters we have.
        //A holds the actions that are performed on the counters.

        int[] counters = new int[N];            //Array that holds the counters
        HashSet<Integer> maxed = new HashSet(); //A set that holds all counters that have been maxed
        int max = 0;                            //Holds the current maximum
        int maxTo = 0;                          //When we find an element that hasn't been maxed, set it to this value

        for(int i = 0; i < A.length; i++) {     //Iterate through the actions
            int action = A[i];                  //Retrieve action
            if(action > 0 && action <= N) {     //If the action refers to an increase of a counter..
                if(!maxed.contains(action)) {
                    counters[action-1] = maxTo; //Set it to the maximum
                    maxed.add(action);          //Mark that this counter has been maxed since last max action
                }
                counters[action-1]++;           //Increase the counter (modify for zero-indexed array)
                if(counters[action-1] > max) {  //Update maximum if needed
                    max = counters[action-1];
                }
            }
            else if(action == N+1){             //If it's a max action
                maxed = new HashSet<>();        //Reset the maxed array, meaning that all counters should be set to maxTo
                maxTo = max;                    //Set the maxTo value to the current maximum
            }
            else {                              //Undefined action
                throw new IllegalArgumentException();
            }
        }
        for(int i = 1; i < N+1; i++) {
            if(!maxed.contains(i)) {    //If this counter hasn't been maxed
                counters[i] = maxTo;    //Set it to the max
            }
        }
        return counters;
    }
}
