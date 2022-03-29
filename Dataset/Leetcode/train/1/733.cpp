 vector<int> XXX(vector<int>& nums, int target) {
    //哈希表
    unordered_map<int, int> hashmap;
    vector<int> res;
    
    for(int i = 0 ;i != nums.size(); i++)
    {
        hashmap[nums[i]] = i;
    }
    
    for(int i = 0; i != nums.size(); i++)
    {
        int gap = target - nums[i];
        if(hashmap.find(gap) != hashmap.end() && hashmap[gap] != i)
        {
            res.push_back(i);
            res.push_back(hashmap[gap]);
            break;
        }
    }
    return res;        
}
