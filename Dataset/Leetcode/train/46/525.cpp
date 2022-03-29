 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>>res;
        queue<int> list;
        vector<int>vec;
        for(int i = 0;i < nums.size(); ++i) {
            list.push(nums[i]);
        }
        getAllDigits(vec, res, list);
        return res;

    }

    void getAllDigits(vector<int>& digit, vector<vector<int>>& digits, queue<int>& nums) {
        int size_t = nums.size();
        for(int i = 0; i < size_t; ++i) {
            int k = nums.front();
            nums.pop();
            digit.push_back(k);
            if(nums.empty()) {
                digits.push_back(digit);
            } else {
                getAllDigits(digit, digits, nums);
            }
            digit.erase(digit.end() - 1);
            nums.push(k);
        }
    }

};

