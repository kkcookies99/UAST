class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        long long len = nums.size();
        long long max=pow(2,len);
        vector<vector<int>> v(max);
        for(int j=0;j<max;j++){
            for(int i=0;i<len;i++){
                if((1<<i)&j){
                    v[j].push_back(nums[i]);
                }
            }
        }
        return v;
    }
};

