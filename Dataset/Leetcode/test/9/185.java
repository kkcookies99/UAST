class Solution {
    public boolean XXX(int x) {
        if (x==0) {return true;}
        if (x<0) {return false;}
        if (x%10 == 0) return false;
        long res=0;
        int pop;
        int y = x;
        while(y!=0){
            pop = y % 10;
            y /= 10;
            res = res*10 + pop;
        }
        if((int)res == x) {return true;}
        else return false;
    }
}

