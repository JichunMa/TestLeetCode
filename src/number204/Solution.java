package number204;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int result = solution.countPrimes(1500000);
        System.out.println("end: " + String.valueOf(System.currentTimeMillis() - start));
        System.out.println(result);
    }


    public int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }
        // 默认所有的元素值都会设置为false，boolean初始值为false
        boolean[] notPrime = new boolean[n];
        notPrime[0] = true;
        notPrime[1] = true;
        for (int i = 2; i * i < n; i++) {
            if (!notPrime[i]) {
                // 如果i是一个质数， 将i的倍数设置为非质数,
                //j += i相当于i的3倍，4倍……
                for (int j = 2 * i; j < n; j += i) {
                    notPrime[j] = true;
                }
            }
        }
        // 统计质数的个数
        int result = 0;
        for (boolean notPri : notPrime) {
            if (!notPri) {
                result++;
            }
        }
        return result;
    }




}