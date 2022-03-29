 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        unordered_set<int> mem;
        int sum = 0;
        int memSum = 0;
        for(auto c:nums){
            int num = mem.count(c);
            if(num == 0){
                mem.insert(c);
                memSum+=c;
            }
            sum+=c;
        }
        return memSum*2 - sum;
    }
};

