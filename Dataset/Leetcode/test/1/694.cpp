 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        vector<int> A;
        int num = nums.size();
        for(int i=0;i<num;i++){
            int diff = target - nums[i];
            for(int j=i+1;j<num;j++){
                if(nums[j]==diff){
                    A.push_back(i);
                    A.push_back(j);
                    return A;
                }
            }
        }
    return A;
    }
}; 

