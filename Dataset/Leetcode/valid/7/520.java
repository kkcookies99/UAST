 class Solution {
    public int XXX(int x) {
        int temp=x;
        long val = 0;
        x = Math.abs(x);
        while(x>0){
            val = x%10 + val*10;
            x = x/10;
        }
        if (val>Integer.MAX_VALUE||val<Integer.MIN_VALUE){
            return 0;
        }
        if (temp>0){
            return (int)val;
        }
        else{
            return -(int)val;
        }
    }
}

