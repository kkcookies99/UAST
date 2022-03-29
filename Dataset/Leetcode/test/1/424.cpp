 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        short i,j,k;
        int temp;
        k=nums.size();
        for(i=0;i<k;i++){
            temp = target - nums[i];
            for(j=i+1;j<k;j++){
                if(nums[j]==temp){
                    return {i,j};
                }
            }
        }     
        return {};
    }
};

