     vector<int> XXX(vector<int>& nums, int target) {
        map<int,int> map;   // 映射：元素值 -> 元素下标
        for(int i = 0; i < nums.size(); ++i)
            if(map.count(target - nums[i]) > 0)
                return vector<int>{map[target - nums[i]], i};
            else
                map[nums[i]] = i;
        // 答案存在且唯一，不会运行到这里，但没这句话过不了编译
        return vector<int>{-1,-1};
    }

