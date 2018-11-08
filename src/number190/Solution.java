package number190;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseBits(43261596));
    }


    //核心思路 对原数据进行右移1位操作 对结果不断左移补充的为0 如果当前位为1 则进行+1操作 即将0改为1
    public int reverseBits(int n) {
        if (n == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = result << 1;
            if ((n & 1) == 1) {
                result = result + 1;
            }
            n = n >> 1;
        }
        return result;
    }
}
