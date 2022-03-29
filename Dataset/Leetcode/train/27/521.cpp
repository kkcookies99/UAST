 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int n=nums.size();
        vector<int>::iterator itr = nums.begin();
        for(int i=0;i<n;i++){
            if(nums[i]==val){
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

