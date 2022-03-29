 class Solution {
    public int XXX(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            result = result * 10 + digit;
            // int类型存储值是有一定范围，如果存储超出它范围的数值，此时值会发生变化。
            // 此时与原先余数进行比较时，如果不对等，则为超出范围
            if (digit != result % 10) {return 0;}
        }
        return result;
    }
}

