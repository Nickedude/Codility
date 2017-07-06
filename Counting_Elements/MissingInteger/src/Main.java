/**
 * Created by MrWicki on 2017-07-06.
 */
public class Main {

    public static void main (String[] args) {
        int a[] = new int[100000];
        int j = 0;
        for(int i = -2147483648; i < -2147483000; i++) {
            a[j++] = i;
        }
        for(int i = 2147483000; i < 2147483647; i++) {
            a[j++] = i;
        }

        Solution s = new Solution();
        System.out.println(s.solution(a));
    }
}
