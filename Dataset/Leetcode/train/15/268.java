 class Solution {
public List<List<Integer>> XXX(int[] nums) {
    List<List<Integer>> res=new ArrayList<>();
    //排序
    Arrays.sort(nums);
    for(int i=0;i<nums.length-2;i++){
        //去重
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }
        //设置一大一小两个数字，转化为二数之和问题，目标为sum=0-nums[i]
        int low=i+1,high=nums.length-1,sum=0-nums[i];
        while(low<high){
            //如果符合条件
            if(nums[low]+nums[high]==sum){
                res.add(Arrays.asList(nums[i],nums[low],nums[high]));
                //去重
                while(low<high && nums[low]==nums[low+1]) low++;
                while(low<high && nums[high]==nums[high-1]) high--;
                low++;
                high--;
            }
            //如果小了，把小的右移一位
            else if (nums[low]+nums[high]<sum){
                low++;
            }
            //如果大了，把大的左移一位
            else high--;
        }
    }
    return res;
}

