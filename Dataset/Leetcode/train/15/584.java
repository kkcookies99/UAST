 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        //先进行排序
        Arrays.sort(nums);
        //初始化集合存储答案
        List<List<Integer>> res = new ArrayList<>();
        //特殊情况判断
        if(nums == null || nums.length == 0 || nums.length < 3){
            return res;
        }
        //开始用双指针的思想
        //首先开始遍历数组（因为是三数之和，除了双指针我们还需要一个指针）
        for(int i = 0; i < nums.length-2 && nums[i] <= 0; i++){
            //重复的情况我们会舍弃，直接跳过本次循环
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            //初始化两个指针
            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                if(nums[i] + nums[left] + nums[right] < 0){
                    left++;
                }
                else if(nums[i] + nums[left] + nums[right] > 0){
                    right--;
                }
                else{
                    //用一个list记录每次循环找到的答案
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    //还不能跳出循环，因为可能后面还有不同的组合
                    //为了避免重复还是需要判断左指针后一位是否和左指针重复
                    //右指针前一位是否和右指针重复
                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    while(left<right && nums[left] == nums[left+1]){
                        left++;
                    }
                    //去寻找后续的不同组合
                    right--;
                    left++;
                }
            }

        }
        return res;
    }
}

