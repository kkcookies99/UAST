class Solution {
    public int XXX(int x) {
        if (x == 0) {
            return 0;
        }
        boolean flag = false;
        if (x < 0) {
            flag = true;
            x = -1 * x;
        }
        // 现在x是正值
        long sum = 0;
        while(x > 0) {
            int p = x % 10;
            x = x / 10;
            
            // 这样 123 就被拆成了 p=3, v=12
            sum = sum * 10 + p;
        }
        if (flag) {
            sum = -1l * sum;
        }
        
        if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
            return 0;
        }
        
        return new Long(sum).intValue();   
    }
}

