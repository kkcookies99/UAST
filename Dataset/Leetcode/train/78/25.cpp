class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ret;
        ret.push_back({});
        int size=nums.size();
        int subsize=pow(2,size);
        int hash=1;
        while(hash<subsize){
            vector<int> temp;
            for(int k=0;k<size;k++) {
                int a=1<<k;
                if(a&hash) {
                    temp.push_back(nums[k]);
                }
            }
            ret.push_back(temp);
            hash++;
        }
        return ret;
    }
};

