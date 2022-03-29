 class Solution {
    public boolean XXX(int[] nums) {
        //从跳跃游戏2过来的，个人认为这个题也可以正反向两种
        //采用正向吧
        int n = nums.length;
        int step = 0;
        if(n == 1){
            return true;
        }
        while(step < n ){
            int gap = nums[step];
            int len = step;
            int max = 0;
            if((len + gap)< n - 1){
                if(gap == 0){
                    return false;
                }
                for(int i = len + 1;i <= len + gap ; i++){
                    int k = i - len + nums[i];
                    if(max<k){
                        step = i;
                        max = k;
                    }
                }
            }else{
                return true;
            }
        }
        return false; 
    }
}

