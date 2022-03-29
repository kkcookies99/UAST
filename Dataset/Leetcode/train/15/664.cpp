 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        if(!nums.size() || nums.size() < 3) return{};
        vector<vector<int>> ans;
        sort(nums.begin(),nums.end());
        int a = 1e6,b,c,target,i,j;
        for(int k=0;k<nums.size()-2;k++){
            if(nums[k] == a) continue;
            a = nums[k];
            target = -a;
            i = k+1;j = nums.size()-1;
            b = 1e6,c = 1e6;
            while(i<j){
                if(nums[i] + nums[j] > target) j--;
                else if(nums[i] + nums[j] < target) i++;
                else{
                    if(nums[i] == b || nums[j] == c){
                        if(nums[i] == b) i++;
                        if(nums[j] == c) j--;
                        continue;
                    }
                    ans.push_back({a,nums[i],nums[j]});
                    b = nums[i];
                    c = nums[j];
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }
};

