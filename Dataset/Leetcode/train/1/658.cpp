 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        unordered_map<int,int> m;
        unordered_map<int,int>::iterator it;
        vector<int> v;
        for(int i=0;i<nums.size();i++)
        {
            m.insert(make_pair(nums[i],i));
            it=m.find(target-nums[i]);
            if(it!=m.end() && it->second != i)
            {
                v.push_back(i);
                v.push_back(it->second);
                break;
            }
        }
        return v;
    }
};

