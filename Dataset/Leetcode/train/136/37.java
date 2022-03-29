 import java.util.HashSet;

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        //这样最后的set就只包含这个不重复的元素了
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                res = nums[i];
                break;
            }
        }
        return res;
    }
}

