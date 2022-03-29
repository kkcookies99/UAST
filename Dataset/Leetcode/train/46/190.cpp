class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> result;
        if(nums.empty()) return result;
        vector<int> path;
        backTrack(nums,path,result);
        return result;
        
    }
private:
     void backTrack(vector<int>& nums,vector<int>&path,vector<vector<int>>&result){
         if(path.size() == nums.size()){
             result.push_back(path);
             return;
        }
         for(auto a : nums){
             if(find(path.begin(),path.end(),a) == path.end()){
                 path.push_back(a);
                 backTrack(nums,path,result);
                 path.pop_back();
             }

         }
     }
};

