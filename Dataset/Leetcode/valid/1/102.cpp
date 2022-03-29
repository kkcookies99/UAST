 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        unordered_map<int,int> m ;
        vector<int> v;
        for(int i=0;i<nums.size();i++){
            if(m[target-nums[i]]>0){
                v.push_back(m[target-nums[i]] - 1);
                v.push_back(i);
                break;
            }
            m[nums[i]] = i + 1;
        }
        
        return v;
    }
};

