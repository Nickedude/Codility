/**
 * Created by MrWicki on 2017-07-28.
 */
public class Main {
    public static void main (String[] args) {
        int[] a = new int[100000];
        for(int i = 1; i < 100001; i++) {
            a[i-1] = i;
        }

        Solution s = new Solution();
        System.out.println(s.solution(a));
    }
}
