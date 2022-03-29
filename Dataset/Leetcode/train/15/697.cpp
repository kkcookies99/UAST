 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>>vec;
        int n = nums.size();
        if(n!=0)
            sort(nums.begin(),nums.end());
        else return vec;
        for(int i = 0;i<=n-3;i++){
            if(i!=0&&nums[i]==nums[i-1])continue;
            for(int j = i+1,k = n-1;j<k;){
                if(nums[j]+nums[k]>-nums[i])k--;
                else if(nums[j]+nums[k]<-nums[i])j++;
                else if(nums[j]+nums[k]==-nums[i]){
                    vec.push_back({nums[i],nums[j],nums[k]});
                    j++;
                    k = nums.size()-1;
                    while(j<n-1&&nums[j]==nums[j-1]){
                        j++;
                    }
                }

            }
        }
        return vec;
    }
};

