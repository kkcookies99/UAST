class Solution {
public:
    bool XXX(vector<int>& nums) {
        int n = nums.size();
        vector<bool> ret(n, false);
        ret[n-1] = true;
        for(int i=n-2;i>=0;i--){
            for(int j=nums[i];j>=0;j--){
                if(i+j >= n-1 ||ret[i+j] == true) {
                    ret[i] = true;
                    break;
                }
            }
        }
        return ret[0];
    }
};

