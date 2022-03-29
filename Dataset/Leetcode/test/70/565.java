class Solution {
    public int XXX(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
//            return XXX(n - 1) + XXX(n - 2); // 递归算法超时了
            int a = 0;
            int b = 1;
            int i = 1;
            int tmp = 0;
            while (i <= n) {
                tmp = a + b;
                a = b;
                b = tmp;
                i++;
            }
            return tmp;
        }
    }
}

