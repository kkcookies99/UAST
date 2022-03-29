 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        for(int i=0;i<nums.size();i++){
            int j=nums.size()-1;
            while(i<j){
                if(nums[i]+nums[j]==target){
                return vector<int> {i,j};
            }
            j--;
            }
        }
        return vector<int> ();
    }
};

