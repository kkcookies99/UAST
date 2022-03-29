 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int i=0,j=nums.size()-1;
        while(i<=j){
            if(nums[j] == val){
                j--;
                continue;
            } 
            if(nums[i] == val){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j--;
            }
            i++;
        }
        return j+1;
    }     
};


