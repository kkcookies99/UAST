 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length<3) return list;
        int len = nums.length;
        Arrays.sort(nums);//升序排序
        for(int i = 0 ; i < len -2 ; i++){
            if(nums[i]>0)break;
            if(i>0 && nums[i] == nums[i-1]) continue; //去重
            int target = -nums[i];//转为 b+c = -a 求两数之和
            int left = i+1;
            int right = len-1;
            while(left<right){
                if(nums[left]+nums[right]==target){
                    list.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]) left++;
                    while(left<right && nums[right]==nums[right+1]) right--;
                }else if(nums[left]+nums[right]<target){
                    left++;
                }else{
                    right--;
                }
               
            }
        }
        return list;
    }
}

