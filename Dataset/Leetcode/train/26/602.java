    public int XXX(int[] nums) {
        // 将原来的数组放进set里面，那么重复的数就会自动排除掉
        Set<Integer> set = new HashSet<>();
        // 统计删除几个数
        int count = 0;
        for(int i : nums){
            int t = set.size();
            set.add(i);
            // 前后长度一致说明没有增加长度，说明删除了一个数
            if(set.size() == t){
                count++;
            }
        }
        int index = 0;
        for(int i: set){
            nums[index++] = i; 
        }
        // 冒泡排序 解决[-1,-3,0,1]这个用例，如果不排序，会出现 -3 比零大的情况，我也很懵比
        int len = nums.length - count;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len - i - 1; j++){
                if(nums[j] > nums[j+1]){
                    nums[j] = nums[j]^nums[j+1];
                    nums[j + 1] = nums[j]^nums[j+1];
                    nums[j] = nums[j]^nums[j+1];
                }
            }
        }
        return len;
    }

