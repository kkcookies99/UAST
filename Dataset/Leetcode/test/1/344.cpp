 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target){
        // 使用哈希表
        map<int, int> m;
        vector<int> res;
        if(nums.empty()) return res;
        for(int i = 0; i < nums.size(); i++){
            if(m.find(target-nums[i]) != m.end()){//在表中找到目标数，将对应的两个下标插入res数组
                res.push_back(m[target-nums[i]]);
                res.push_back(i);
                break;
            }
            else{
                m.insert(pair<int, int> (nums[i], i)); // 否则将键值对插入哈希表中
            }
        }
        return res;
    }
};

