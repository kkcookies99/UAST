class Solution {
public:
   vector<vector<int>>  res;
   vector<vector<int>> XXX(vector<int>& nums) {
       vector<int> v;
       dfs(nums,v,0);
       return res;
   }
   
   void dfs(vector<int> &nums,vector<int> v,int begin){
       res.push_back(v);
       if(begin==nums.size())
           return;
       
       
       for(int i=begin;i<nums.size();i++){
           v.push_back(nums[i]);          
           dfs(nums,v,i+1);
           v.pop_back();
       }
   }
};
` 
