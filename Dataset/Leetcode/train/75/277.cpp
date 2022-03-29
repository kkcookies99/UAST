class Solution {
public:
    void XXX(vector<int>& nums) {
        int k=nums.size();
        for (int i=0;i != k; ++i) {
            if (nums[i]==0) {
                nums.erase(nums.begin()+i);
                nums.insert(nums.begin(),0);
            }

            if (nums[i]==2) { 
                nums.erase(nums.begin()+i--);
                nums.insert(nums.end(),2);
                k--;
            } 
        }
    }
};

