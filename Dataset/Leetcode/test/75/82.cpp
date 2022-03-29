class Solution {
public:
    void XXX(vector<int>& nums) {
        int left=0,right=nums.size()-1;
        for(int i=0;i<nums.size();i++){
            if( !(i>=left && i<=right))continue;
            if(nums[i]==0){
                swap(nums[i],nums[left++]);
                i--;
            }else if(nums[i]==2){
                swap(nums[i],nums[right--]);
                i--;
            }
            
        }
    }
};

