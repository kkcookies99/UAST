 class Solution {
    public int XXX(int[] nums) {
        final int n=nums.length;
        if(n==0)return 0;
        int i=0,j=1,cnt=1;
        while(i<n&&j<n){
            while(i<n&&j<n&&nums[i]==nums[j]){
                j++;
            }
            if(j<n&&i+1<n){
                nums[i+1]=nums[j];   
                cnt++;
            }
            i++;
        }
        return cnt;
    }
}

