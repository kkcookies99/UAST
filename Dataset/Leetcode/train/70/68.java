class Solution {
    private int[] steps;
    public int XXX(int n,int x) {
        steps = new int[n+1];
        return climb(n);
    }

    private int climb(int n) {
        if(steps[n] != 0) return steps[n];
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else if(n == 2) return 2;
        int res = climb(n-1) + climb(n-2);
        steps[n] = res;
        return res;  
    }
}

