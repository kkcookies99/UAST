 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>>v1;
        if(nums.size()<3)
        return v1;
        sort(nums.begin(), nums.end());
        for(int i=0;i<nums.size()-2;i++){
            if(i==0||nums[i]!=nums[i-1]){
            for(int j=i+1;j<nums.size()-1;j++){
                if(j==i+1||nums[j]!=nums[j-1]){
                for(int k=j+1;k<nums.size();k++){
                     if(k==j+1||nums[k]!=nums[k-1]){
                    if (nums[i]+nums[j]+nums[k]==0)
                    {vector<int>v={nums[i],nums[j],nums[k]};
                    v1.push_back(v);}
                    }
                }
                }
            }
            }
        }
        return v1;
    }
};


