 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int count = 0;
        int len = nums.size();

        for(auto it = nums.begin(); it != nums.end();) {
            if(*it == val) {
                count++;
                it = nums.erase(it);
            }
            else it++;
        }

        return len - count;
    }
};

