 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        
        List<List<Integer>> listList = new ArrayList<>();
        // 如果为null或者长度小于3则返回空
        if(nums == null || nums.length < 3)
            return listList;
        // 对数组进行排序
        Arrays.sort(nums);
        
        // 排序后，如果最小值大于0或者最大值小于0则不可能三个数加起来等于0,
        if(nums[0] > 0 || nums[nums.length - 1] < 0)
            return listList;
        
        // 遍历数组
        for(int i = 0; i < nums.length - 2; i++) {
            
            // 当不是第一个元素的时候，如果该元素和前面的元素相等则continue；删除重复
            if(i != 0 && nums[i] == nums[i - 1])
                continue;
            
            // 左右指针
            int l = i + 1;
            int r = nums.length - 1;
            
            // 左指针小于右指针，而且当前值必须小于1，否则三个数都大于等于1.
            while(l < r && nums[i] < 1) {
                int s = nums[i] + nums[l] + nums[r];
                if(s == 0) { // 满足条件
                    
                    // 结果添加到列表，左右指针相向移动
                    listList.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    // 检查左右指针是否重复，重复则移动
                    while(l < r && nums[l] == nums[l - 1])
                        l++;
                    while(l < r && nums[r] == nums[r + 1])
                        r--;
                } else if(s > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        
        return listList;
    }
}

