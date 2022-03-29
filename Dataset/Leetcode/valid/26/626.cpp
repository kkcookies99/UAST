 class Solution {
public:
    int XXX(vector<int>& nums) {
        int n=nums.size();
        vector<int>::iterator itr = nums.begin();
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums.erase(itr);
                i--;
                n--;
            }else{
                itr++;
            }
        }
        return nums.size();
    }
};

