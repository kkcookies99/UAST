class Solution {
    public boolean XXX(int x) {
        if(x < 0){
            return false;
        }
        int tmpX = x;
        int reverseX = 0;
        while(tmpX != 0){
            reverseX *= 10;
            reverseX += tmpX % 10;
            tmpX /= 10;
        }
        return x == reverseX;
    }
}

