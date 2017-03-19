// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
		//Currently at X, wants to go to Y, takes steps of distance D.

		int nrofsteps = (Y-X)/D;	//Calculate the difference between the positions and divide it with the distance of each step. 
		
		if((Y-X)%D != 0) {			//If the difference doesn't contain a factor of D, add an extra step. Since the division above will be rounded down this is needed.  
			nrofsteps++;
		}
		
		return nrofsteps;
	}
}