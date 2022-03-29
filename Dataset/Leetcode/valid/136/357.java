 class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=1;
        if(nums.length==i-1) return 0;
        else{
            while(i<nums.length){
                if(nums[i]==nums[i-1]){
                if(i+2==nums.length) break;
                else i+=2;
                }
                else return nums[i-1];
        }

    }
    return  nums[nums.length-1];
    }
}

