class Solution {
    public int XXX(int x) {
        if(x == 0){
            return 0;
        }
        int res = 0;
        int i = 1;
        while(x >= 0){
            x = x - i;
            res++;
            i += 2;
        }
        return res - 1;
    }
}
