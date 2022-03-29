class Solution {
    public int XXX(int n) {
        // DP
        if(n == 1 || n == 2){
            return n;
        }
        int pre1 = 2;
        int pre2 = 1;
        int sum = 0;
        while(n > 2){
            sum = pre1 + pre2;
            pre2 = pre1;
            pre1 = sum;
            n--;
        }
        return sum;
    }
}

