class Solution {
    public boolean XXX(int[] nums) {
        boolean flag = true;;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]==0){
                if(i==0){
                    flag = false;
                    break;
                }
                for(int j=i-1;j>=0;j--){
                    if(j+nums[j]>i){
                        i=j;
                        break;
                    }
                    if(j==0){
                        flag =false;
                    }
                }
            }
        }
        return flag;
    }
}

