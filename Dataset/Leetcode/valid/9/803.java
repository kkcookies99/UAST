 class Solution {
    public boolean XXX(int x) {
        int ans = 0;
        int tes = x;
        if (x < 0) return false;
        while (tes != 0) {
            ans = ans * 10 + tes % 10;
            tes = tes / 10;
        }
        return x == ans;
    }
}

