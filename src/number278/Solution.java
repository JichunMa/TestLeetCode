package number278;

public class Solution {
    final int firstError = 11507692;

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstBadVersion(14207366));
    }

    public int firstBadVersion(int n) {
        return findIndex(1, n);
    }

    public int findIndex(int start, int end) {
        if (start == end) {
            return start;
        } else {
            if (end - start == 1) {
                if (!isBadVersion(start)) {
                    return end;
                } else {
                    return start;
                }
            } else {
                int current = start + (end - start) / 2;
                if (isBadVersion(current)) {
                    // 注意这条边界条件
                    if (!isBadVersion(current - 1)) {
                        return current;
                    } else {
                        if (current - start == 1) {
                            if (!isBadVersion(start)) {
                                return current;
                            } else {
                                return start;
                            }
                        }
                        return findIndex(start, --current);
                    }
                } else {
                    return findIndex(++current, end);
                }
            }
        }
    }

    boolean isBadVersion(int version) {
        if (version >= firstError) {
            return true;
        }
        return false;
    }
}
