class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.empty()) return vector<vector<int>>();
        vector<vector<int>> ans;
        vector<vector<int>> signal;
        vector<int> temp;
        int length = nums.size();
        traceback(0, signal, temp, length);
        for(int i = 0; i < signal.size(); i++) {
            temp.clear();
            for(int j = 0; j < nums.size(); j++) {
                if(signal[i][j]) temp.push_back(nums[j]);
            }
            ans.push_back(temp);
        }
        return ans;
    }

    void traceback(int cur_level, vector<vector<int>>& signal, vector<int>& temp, int length) {
        if(cur_level == length) {
            signal.push_back(temp);
            return;
        }
        for(int i = 0; i < 2; i++) {
            temp.push_back(i);
            traceback(cur_level + 1, signal, temp, length);
            temp.pop_back();
        }
    }
};

