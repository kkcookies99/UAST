class Solution {
    vector<vector<int>> ans;
    vector<int> v;
    vector<bool> use;
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int n = nums.size();
        while(n-- >0){
            use.push_back(false);
        }
        subPermute(nums);
        return ans;

    }
    void subPermute(vector<int> &nums){   
        if(v.size() == nums.size()){ans.push_back(v);}
        for(int index = 0;index < nums.size();index++){
            if(use[index] == true) continue;
            use[index] = true;
            v.push_back(nums[index]);
            subPermute(nums);
            v.pop_back();
            use[index] = false;
            
        }
    }
};

