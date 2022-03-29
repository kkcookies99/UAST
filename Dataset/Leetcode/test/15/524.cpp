 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>>ans;
        sort(nums.begin(),nums.end());
        int n = nums.size();
        for(int first=0;first<n;first++){
            if(first>0&&nums[first]==nums[first-1]){
                continue;
            }   
            int target = -nums[first];
            int third = n-1;
            for(int second=first+1;second<n;second++){
                if(second>first+1&&nums[second]==nums[second-1])continue;
                while(second<third&&(nums[second]+nums[third]>target)){//这里为什么用！=或者==取反不满足
                    third--;
                }
                if(second==third)break;
                if(nums[second]+nums[third]==target){
                    ans.push_back({nums[first],nums[second],nums[third]});
                }  
            }
        }
        return ans;
    }
};

