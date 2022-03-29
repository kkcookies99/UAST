 vector<int> XXX(vector<int>& nums, int target) {
        vector<int> retSet;
    
        //存放目标差值&&对应序号
        map<int, int> numMap;
        for (int i=0; i!=nums.size(); i++) {
            int temp = target - nums[i];
            if (numMap.find(temp) != numMap.end() && numMap[temp] != i) {
                retSet.push_back(i);
                retSet.push_back(numMap[temp]);
                break;
            }
        
            numMap.insert(make_pair(nums[i], i));
        }
    
        return retSet;
    }

