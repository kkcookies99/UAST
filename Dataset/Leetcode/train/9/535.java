 class Solution {
    public boolean XXX(int x) {
        if(x<0) return false;
        int temp = 0;
        int count = x;
        while(x!=0) {
            temp = temp*10 + x%10;
            x = x/10;
        }
        return temp==count;
    }
}

