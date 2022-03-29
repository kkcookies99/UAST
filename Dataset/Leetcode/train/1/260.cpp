     vector<int> XXX(vector<int>& nums, int target) {
        int n = nums.size();
        vector<pair<int, int>> vec;
        for (int i = 0; i < n; i++) {
            vec.push_back(make_pair( nums[i],i ));
        }
        sort(vec.begin(), vec.end());
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int total = vec[i].first + vec[j].first;
            if (total > target) {
                j--;
            }
            else if (total < target) {
                i++;
            }
            else {
                if (vec[i].second != vec[j].second) {
                    return { vec[i].second,vec[j].second };
                }
                j--;
            }
        }
        return  {};
    }

