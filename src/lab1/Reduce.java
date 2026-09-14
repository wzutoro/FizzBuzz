package lab1;

public class Reduce {
    public static void main(String[] args) {
        int ans = reduce(100);

        System.out.println(ans);
    }

    public static int reduce(int n) {
        int cnt = 0;

        while(n > 0) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n--;
            }

            cnt++;
        }

        return cnt;
    }
}
