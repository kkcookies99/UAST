class Solution {
    public boolean XXX(int[] nums) {
        if(nums.length == 1) return true;
        if(nums[0]==0){
            return false;
        }
        boolean re=false;
        int i=0;
        while(i<nums.length){
            if(nums[i]+i>=nums.length-1){
                return true;
            }
            if(nums[i]==0){//关键点，寻找0,找到0的时候向前查找有没有一个数子字可以跳过去0，如果可以跳过去，那么一定可以到结尾
                while(i+1<nums.length&&nums[i+1]==0){
                    i++;
                }
                re=false;
                for(int j=i-1;j>=0;j--){
                    
                    if(nums[j]+j>i){
                        re=true;
                        break;
                    }
                }
                if(!re){
                    return false;
                }
                
                i++;
            }else{
                i++;
            }
        }
       
        return true;
    }
}

