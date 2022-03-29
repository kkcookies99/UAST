 class Solution {
public:
    vector<vector<int>> XXX(vector<int> &nums) {
        vector<vector<int>> res;
        vector<int> x;
        res.push_back(x);

        if (nums.empty()) {
            return res;
        }

        vector<int> tmpNums;
        for (int i = 1; i < nums.size() + 1; ++i) {
            tmpNums.assign(nums.begin(), nums.end());
            addSubsets(res, tmpNums, i);
            vector<int>().swap(tmpNums);  // 释放vector内存
        }

        return res;
    }

private:
    void addSubsets(vector<vector<int>> &res, vector<int> &nums, int n) {
        vector<int> tmp{};
        for (int i = 0; i < n; ++i) {
            tmp.push_back(nums[i]);
        }

        if (n != 1) {
            for (auto it = nums.begin() + n; it < nums.end() + 1; ++it) {
                res.push_back(tmp);
                tmp.pop_back();
                tmp.push_back(*it);
            }

            vector<int>().swap(tmp); // 释放vector内存

            nums.erase(nums.begin(), nums.begin() + 1);
            if (nums.size() >= n)
                addSubsets(res, nums, n);
        } else {
            res.push_back(tmp);
            vector<int>().swap(tmp); // 释放vector内存

            nums.erase(nums.begin(), nums.begin() + 1);
            if (!nums.empty())
                addSubsets(res, nums, n);
        }

    }
};

