 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> v;
        if(nums.size()==0)  return v;
        sort(nums.begin(),nums.end());
        permutation(nums,v,0);
        return v;
    }
    void permutation(vector<int> nums,vector<vector<int>> &v,int index){
        if(index==nums.size()-1){
            v.push_back(nums);
            return;
        }
        else{
            permutation(nums,v,index+1);
            for(int i=index;i<nums.size();i++){
                if(nums[index]!=nums[i]){
                    swap(nums[index],nums[i]);
                    permutation(nums,v,index+1);
                }
            }
        }
    }
};

