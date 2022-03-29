class Solution {
    public int XXX(int[] nums) {
        int max=-100000,sum=0;
        for(int x:nums){
            if(sum<0) sum=x;
            else sum+=x;
            max=Math.max(max,sum);
        }
        return max;
    }
}

