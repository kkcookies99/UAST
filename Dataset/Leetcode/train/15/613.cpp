 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        std::multimap<int, long> nums_map;
        std::unordered_map<long, bool> nums_found_map;
        vector<vector<int>> ret;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                int sum = nums[i] + nums[j];
                long nums_data = (long(i) << 51) + (long(abs(nums[i])) << 32) + abs(nums[j]);
                if (nums[i] < 0) nums_data += 0x8000000000000000;
                if (nums[j] < 0) nums_data += 0x80000000;
                nums_map.insert({sum, nums_data});
            }
        }
        for (int i = 0; i < nums.size(); i++) {
            int num = nums[i];
            int need_num = -num;
            auto multimap_pair = nums_map.equal_range(need_num);
            if (multimap_pair.first == multimap_pair.second) {
                continue;
            }
            for(auto it = multimap_pair.first; it != multimap_pair.second; it++) {
                long matched_nums = it->second;
                int index = matched_nums >> 51 & 0xfff;
                int nums_a = int(matched_nums >> 32) & 0x7ffff;
                if (matched_nums & 0x8000000000000000) nums_a = -nums_a;
                int nums_b = matched_nums & 0x7ffff;
                if (matched_nums & 0x80000000) nums_b = -nums_b;
                if (index <= i) {
                    continue;
                }
                int nums_min = std::min(nums_a, std::min(nums_b, num));
                int nums_max = std::max(nums_a, std::max(nums_b, num));
                int nums_middle = 0 - nums_min - nums_max;
                long key = (long(abs(nums_min)) << 34) + (long(abs(nums_middle)) << 17) + nums_max;
                if (nums_min < 0) key += 0x8000000000000;
                if (nums_middle < 0) key += 0x200000000;
                if (nums_found_map.find(key) == nums_found_map.end()) {
                  nums_found_map.insert({key, true});
                  ret.push_back({nums_min, nums_middle, nums_max});
                }
            }
        }
        return ret;
    }
};

