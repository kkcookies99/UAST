 class Solution {
    public boolean XXX(int x) {
        if(x < 0){
            return false;
        }
        int y = reverseNum(x);
        return x == y?true:false;
    }

    // reverse the number of x
    public int reverseNum(int x){
        int num = 0;
        while(x != 0){
            num = num*10+x%10;
            x = x/10;
        }
        return num;
    }
}

