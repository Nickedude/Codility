import java.util.HashSet;

/**
 * Created by MrWicki on 2017-07-06.
 */
public class Solution {

    public int solution (int x, int[] a) {
        HashSet<Integer> seen = new HashSet<>();
        int remaining = x;

        for(int i = 0; i < a.length; i++) {
            int current = a[i];                 //Check which position is available now

            if(current > x) {                   //If the element is at a position that's larger than x it's of no use
                continue;
            }
            else if(!seen.contains(current)) {       //If we haven't seen it already
                seen.add(current);              //Marked it as seen
                remaining--;                    //Note that we're now missing fewer leaves
                if(remaining == 0) {            //If no leaves remain we're done
                    return i;                   //Return the time at which we're able to jump across the river
                }
            }

            //If it's already been seen, move on
        }

        //If we have run out of elements without remaining reaching 0 we can't get across
        return -1;
    }
}
