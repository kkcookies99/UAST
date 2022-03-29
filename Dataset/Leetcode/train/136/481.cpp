 class Solution {
public:
    int singleNumber(vector<int>& nums) {

        map<int, int> m;
        for (auto &i : nums) {
            m[i]++;
        }
        int result = 0;
        for (auto &i : m) {
            if (i.second == 1) {
                result = i.first;
            }
        }
        
        return result;
    }
};

