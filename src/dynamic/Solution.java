package dynamic;

//动态规划相关笔记
public class Solution {

    //自上而下 也就是从6开始 当算6的时候 求解出了5,4,3,2,1 把备忘录填满了 在求解5,4,3,2,1时可以直接从备忘录里取值即可 无须再次计算
    //带着一个备忘录(保存着已经求解过的结果)进行求解
    public static int Fibonacci(int n) {
        if (n <= 0)
            return n;
        int[] Memo = new int[n + 1];
        for (int i = 0; i <= n; i++)
            Memo[i] = -1;
        return fib(n, Memo);
    }

    public static int fib(int n, int[] Memo) {
        if (Memo[n] != -1) {
            return Memo[n];
        }
        //如果已经求出了fib(n)的值直接返回，否则将求出的值保存在Memo备忘录中。
        if (n <= 2) {
            Memo[n] = 1;
        } else Memo[n] = fib(n - 1, Memo) + fib(n - 2, Memo);
        return Memo[n];
    }

    // 自底而上的动态规划
    // 自底向上 依次向上求解 就不需要进行递归了 一遍循环就好
    public static int fib(int n) {
        if (n <= 0)
            return n;
        int[] Memo = new int[n + 1];
        Memo[0] = 0;
        Memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            Memo[i] = Memo[i - 1] + Memo[i - 2];
        }
        return Memo[n];
    }

    // 自底向上 进一步优化 无须数组 其实只需要3个值即可，索引为i-2,i-1,i的变量
    public static int fib2(int n) {
        if (n <= 0)
            return n;
        int value_i_2 = 0;
        int value_i_1 = 1;
        int value_i = 1;
        for (int i = 2; i <= n; i++) {
            value_i = value_i_2 + value_i_1;
            value_i_1 = value_i;
            value_i_2 = value_i_1;
        }
        return value_i;
    }

    //    钢条切割问题
    public static int cut(int[] p, int n, int[] r) {
        int q = -1;
        if (r[n] >= 0)
            return r[n];
        if (n == 0)
            q = 0;
        else {
            for (int i = 1; i <= n; i++)
                q = Math.max(q, cut(p, n - i, r) + p[i - 1]);
        }
        r[n] = q;

        return q;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] p = {1, 5, 8, 9};
        int n = p.length;
        //先构造一个备忘录 然后再进行求解
        int[] r = new int[n + 1];
        for (int i = 0; i < r.length; i++) {
            r[i] = -1;
        }

        int result = solution.cut(p, n, r);
        System.out.println(result);
    }


    //切钢管 自底向上的求解
    public static int buttom_up_cut(int[] p) {
        int r[] = new int[p.length + 1];
        int n = p.length;
        for (int i = 1; i < r.length; i++) {
            int q = -1;//当前最优解
            for (int j = 0; j <= i; j++) {
                Math.max(q, p[j] + r[n - j]);
            }
            r[i] = q;
        }
        return r[n];
    }

}
