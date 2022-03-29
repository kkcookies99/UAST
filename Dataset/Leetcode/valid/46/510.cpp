 class Solution {
public:
    vector<vector<int>> ans;
    int N;

    vector<vector<int>> XXX(vector<int>& nums) {
        N = nums.size();

        int amount = 1;
        for (int i = 2; i <= N; ++i) {
            amount *= i;
        }

        ans.reserve(amount);
        vector<int> temp; temp.reserve(N);
        traceback(nums, temp);

        return ans;
    }

    void traceback(vector<int>& nums, vector<int>& storage) {
        if (N == storage.size()) {
            ans.push_back(storage);
            return;
        }

        for (int i = 0; i < N; ++i) {
            if (nums[i] == INT32_MIN) continue;

            int temp = nums[i];
            nums[i] = INT32_MIN;
            storage.push_back(temp);

            traceback(nums, storage);

            storage.pop_back();
            nums[i] = temp;
        }

    }

};

