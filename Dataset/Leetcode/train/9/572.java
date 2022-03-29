 class Solution {
    public boolean XXX(int x) {
        if(x < 0) return false;
        if(x == Integer.MAX_VALUE) return false;
        
        int help = 1;
        //使help与x的位数一样
        while(help <= (x/10))
            help *= 10;
        
        while(x != 0){
            //如果最高位和最低位不相等，则一定不是回文，直接返回false
            if(x / help != x % 10)
                return false;
            //此时将x的最高位和最低位去掉
            x = x % help / 10;
            help /= 100;
        }
        return true;
    }
}

