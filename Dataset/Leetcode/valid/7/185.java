class Solution {
    public int XXX(int x) {
        
        // 防止反转后超出int的范围
        long num = 0;
        
        while(x != 0) {
            num = x % 10 + num * 10;
            // 如果超出范围了 直接返回0
            if(num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
                return 0;
        }
            x = x / 10;
        }
        
   
        return (int)num;   
        
    }
}

