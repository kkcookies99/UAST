 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        vector<int> res(nums.size(),0);
        int count=0;
        for(int i=0;i<nums.size();i++){
            res[nums[i]]++;
        }
        for(int j=0;j<nums.size();j++){
            if(res[j]==1){
                count=j;
                break;
            }
        }
        return count;
    }
};

