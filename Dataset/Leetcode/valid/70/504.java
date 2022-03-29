class Solution {
    public int XXX(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }

        int tmp1 = 1;
        int tmp2 = 2;

        for (int i = 2; i < n - 1; i++) {
            if (i % 2 == 0) {
                tmp1 += tmp2;
            } else {
                tmp2 += tmp1;
            }
        }
        return tmp1 + tmp2;
    }
}

