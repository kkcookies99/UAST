class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> v;
        int n=nums.size();
        int end=1<<n;
        int i=0;
        vector<int> t;
        while(i<end) {
            t.clear();
            for(int j=0;j<n;j++) {
                if((1<<j)&i) t.push_back(nums[j]);
            }
            v.push_back(t);
            i++;
        }
        return v;
    }
};

