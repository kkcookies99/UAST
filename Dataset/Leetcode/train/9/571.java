 class Solution {
    public boolean XXX(int x) {
        if (x == 0){
            return true;
        }
        if (x < 0 || x %10 ==0){
            return false;
        }
        int tmp = x;
        int cnt = 0;
        while(tmp > 0){
            cnt = cnt*10 + tmp%10;
            tmp /= 10;  
        }
        return cnt == x;
    }
}

