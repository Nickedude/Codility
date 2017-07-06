/**
 * Created by MrWicki on 2017-07-06.
 */

import java.util.*;

public class Solution{

    //Returns the minimal positive integer that does not occur in a.
    // 1 < n < 100 000
    public int solution (int[] a) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //Sort the array using the priority queue
        for(int i = 0; i < a.length; i++) {
            pq.add(a[i]);
        }

        //Remove all non-positive elements
        while(!pq.isEmpty()) {
            int top = pq.peek();
            if(top <= 0) {
                pq.poll();
            }
            else {
                break;
            }
        }

        //If there were only negative numbers, return 1
        if(pq.isEmpty()) {
            return 1;
        }

        //Otherwise, get the smallest positive number
        int current = pq.poll();

        //If it's not 1, then 1 is the smallest none-occuring number
        if(current > 1) {
            return 1;
        }

        //If it is 1, check the ordering of the remaining elements
        while(!pq.isEmpty()) {
            int next = pq.poll();   //Get the next element

            //If they're equal or in order, continue to the next element
            if((next == current) || (next == (current +1))) {
                current = next;
            }
            //If they're not in order, return the first one in the gap
            else {
                return (current + 1);
            }

        }

        //If all of the remaining elements were in order, return the last one +1
        return (current + 1);
    }
}
