 class Solution {
public:
    void swap(vector<int>&nums,int i,int j){
        int tmp=nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    void perm(vector<int>& nums,int l,int r,vector<vector<int>>&ans){
        if (l==r) {ans.push_back(nums);return ;}
        for(int i=l;i<nums.size();i++){
            swap(nums,l,i);
            perm(nums,l+1,r,ans);
            swap(nums,i,l);
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {        
        vector<vector<int>> ans; 
        perm(nums,0,nums.size()-1,ans); 

        return ans;
    }
};

