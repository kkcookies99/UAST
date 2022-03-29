 class Solution {
private:
vector<vector<int>>res;
vector<int>path;
void func(int first,vector<int>& nums){
   if(first>nums.size()-1)return;
   for(int i=first;i<nums.size();i++){
       path.push_back(nums[i]);
       res.push_back(path);
       func(i+1,nums);
       path.pop_back();
   }
}
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        this->res=res;
        this->path=path;
        res.push_back(path);
        if(nums.size()==0)return res;
        func(0,nums);
        return res;
    }
};

