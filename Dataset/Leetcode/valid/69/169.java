class Solution {
    public int XXX(int x) {
        if(x == 1) return 1;
        for (int i = 1; i <= x / i; i++) {
            if (i <= x/i && x/(i+1) < i+1) return i;
            if (i < x/i && x/(i+1) <= i+1) return i+1;
        }
        return 0;
    }
}

