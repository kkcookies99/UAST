    public double XXX(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        // 保证 m<=n
        if (m > n) {
            int[] temp = A;
            A = B;
            B = temp;
            int tmp = m;
            m = n;
            n = tmp;
        }
        int iMin = 0, iMax = m;
        //保证len(left_part)>len(right_part)
        int halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            // i 的值太大，这里注意i的值不断减小有可能i变为0,j变为n,必须保证大于0,j也必须小于n
            if (i > iMin && B[j] < A[i - 1]) {
                iMax = i - 1;
            }// i 的值太小
            else if (i < iMax && A[i] < B[j - 1]) {
                iMin = i + 1;
            }// i的值刚好
            else {
                int maxLeft = 0;
                //特殊情况i==0，数组A的left_part为空，只能取B的left_part的最大值
                if (i == 0) {
                    maxLeft = B[j - 1];
                } else if (j == 0) {
                    maxLeft = A[i - 1];
                } else {
                    maxLeft = Math.max(A[i - 1], B[j - 1]);
                }
                if ((m + n) % 2 == 1) {
                    return maxLeft;
                }

                int minRight = 0;
                if (i == m) {
                    minRight = B[j];
                } else if (j == n) {
                    minRight = A[i];
                } else {
                    minRight = Math.min(B[j], A[i]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }

