class Solution {
    public int XXX(int x) {
        int ans = 0;
        int k = 0;    
        while(x != 0){
            k = k*10+x%10;
            if(k/10 != ans) return 0; //如果除以10不等于上次计算的结果说明存在溢出返回0
            ans = k;
            x /= 10;
            System.out.println(ans);
        }
        return ans;
    }
}

