public class Solution {

    public int solution(int A, int B, int K) {
        if(K > B)
            return 0;

        if(A % K != 0) {
            A = A + K - (A % K);    //Find first nr divisible
        }

        B = B - (B%K);

        if((B - A) < 0)
            return 0;

        return ((B-A)/K) + 1;
    }

    public static void main (String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(0, 1, 11));
        System.out.println(1 % 11);
    }
}
