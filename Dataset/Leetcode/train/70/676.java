class Solution {
    public int XXX(int n) {
         /*
        * 举例说明、n : 0 1 2 3 4 5 6
        *       temp : 0 1 2 3 5 8 13
        * 从第三项开始，每一项等于前两项之和，满足斐波那契数列
        */
        if (n<=2) return n;
        int i1 = 1;
        int i2 = 2;
        for (int i = 3 ; i <= n ; i++){
            int temp = i1 + i2 ;
            i1 = i2;
            i2 = temp;
        }
        return i2;
    }
}

