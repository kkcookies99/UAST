class Solution {
    public int XXX(int x) {
        if(x==0 || x==1) return x;

        int pre = 1;
        int post = x;
        
        while(pre + 1 < post){

            int mid = pre + (post - pre)/2;
            // 乘法判断溢出， 用除法
            if(x/mid == mid) return mid;
            else if(x/mid > mid) pre = mid;
            else post = mid;
        }
        // 因为pre一定是平方小于x中最大的那个值， 即为结果返回
        return pre;
    }
}

