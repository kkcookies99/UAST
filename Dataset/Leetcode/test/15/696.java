 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        //如果数组不存在或者数组数量小于3，则直接返回空数组
        if(nums == null || nums.length < 3) return lists;
        //对数组进行排序
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0;i < len;i++){
            //如果当前值大于0，则后面的值都会比0大，直接返回lists即可
            if(nums[i] > 0) return lists;
            //如果当前值跟上一个值相同，为了防止重复添加，则直接跳出当前循环
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int cur = nums[i];
            int left = i + 1, right = len - 1;
            while(left < right){
                int temp = cur + nums[left] + nums[right];
                //当断三数之和是否等于0，等于0则将数据添加到数组内，大于0则左移右指针，小于0则右移左指针
                if(temp == 0){
                     List<Integer> list = new ArrayList<>();
                     list.add(cur);
                     list.add(nums[left]);
                     list.add(nums[right]);
                     lists.add(list);
                     //在这个过程中进一步排除可能出现的重复的数据
                     while(left < right && nums[left] == nums[left + 1]){
                         left += 1;
                     }
                    while(left < right && nums[right - 1] == nums[right]){
                        right -= 1;
                    }
                    //排除掉最近的重复元素之后开始平移左右指针
                    left += 1;
                    right -= 1;
                }else if(temp < 0){
                    left += 1;
                }else{
                    right -= 1;
                }
            }
        }
        return lists;
    }
}

