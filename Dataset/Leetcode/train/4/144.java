class Solution {
    public double XXX(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int len = m + n;
        int left = -1, right = -1;
        int aStart = 0, bStart = 0;
        for (int i = 0; i <= len / 2; i++) {
            left = right;  // 每次循环前将 right 的值赋给 left
            // A移动的条件: B遍历到最后 或 当前A<B,满足一个即可
            if (aStart < m && (bStart >= n || A[aStart] < B[bStart])) {
                right = A[aStart++];
            } else {
                right = B[bStart++];
            }
        }
        if ((len & 1) == 0) // 与1交,判断奇偶数,更快速
            return (left + right) / 2.0;
        else
            return right;
    }
}


