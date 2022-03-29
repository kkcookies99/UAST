 class Solution {
    public int XXX(int m, int n) {
        if(m == 1 || n == 1) return 1;
        m--;n--; // 调整使Start->Finish需要向下m格，向右n格
        long ans = m < n ? 
            myFactorial(m + n, n) / myFactorial(m, 0) : 
            myFactorial(m + n, m) / myFactorial(n, 0); 
        return (int)ans;
    }

    /** return c*(c-1)*...*(f+1) (ceil > floor)
     *  即 c!/f!
     */
    private long myFactorial(int ceil, int floor) {
        if (ceil <= floor) return 1;
        long ans = ceil--;
        // while (ceil > floor) ans *= ceil--;
        for (; ceil > floor; ceil--) ans *= ceil;
        return ans;
    }
}

