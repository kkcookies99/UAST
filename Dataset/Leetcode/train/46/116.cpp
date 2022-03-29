class Solution {
public:
vector<vector<int>>res;
vector<int>path;
void backtracking(vector<int>&nums,int k){
   if(path.size()==k){
       res.push_back(path);
       return ;
   }
   int size=nums.size();
   for(int i=0;i<size;i++){
       int num=nums[i];
       path.push_back(num);
       nums.erase(nums.begin()+i);
       backtracking(nums,k);
       nums.insert(nums.begin()+i,num);
       path.pop_back();
   }
}
    vector<vector<int>> XXX(vector<int>& nums) {
        backtracking(nums,nums.size());
        return res;
    }
};

