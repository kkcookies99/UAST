class Solution {
    public boolean XXX(int[] nums) {
        int n=nums.length;
        
        int k=n-1;
        
        for(int i=n-1;i>=0;i--){
            if(i+nums[i]>=k){//i可以到达最后一个元素
                k=i;
            }
        }
        return k==0;
    }
}

