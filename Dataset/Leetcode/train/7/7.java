class Solution {
    public int XXX(int x) {
        boolean flag = false;
        if(x < 0){
            flag = true;
            x = -x;
        }

        int sum = 0;
        while(x > 0) {
            if (sum > (Integer.MAX_VALUE - x % 10) / 10)
                return 0;
            sum = sum * 10 + x % 10;
            x /= 10;
        }
    
        return flag ? -sum : sum;
    }
}

